package section10_streams_and_lambdas;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;

public class BigDataPartitioningAndGrouping {

    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    record Person(String firstName, String lastName, BigDecimal salary, String state, char gender) {}
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Map<Boolean, Map<String, Long>> result = Files.lines(Path.of("/Users/Dave/Downloads/Hr5m.csv")).parallel() // use multiple threads to improve speed
                    .skip(1)
//                    .limit(200)
                    .map(s -> s.split(","))
                    .map(a -> new Person(a[2], a[4], new BigDecimal(a[25]), a[32], a[5].charAt(0)))
                    .collect(partitioningBy(p -> p.gender =='F',
                            groupingBy(Person::state, counting())));
//                    .forEach((state, salary) -> System.out.printf("%s -> %s%n", state, salary));

            long endTime = System.currentTimeMillis();
            System.out.println(result);
            System.out.println(endTime - startTime + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
