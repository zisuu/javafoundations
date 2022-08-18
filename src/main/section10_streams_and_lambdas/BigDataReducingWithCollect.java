package section10_streams_and_lambdas;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Map;
import java.util.TreeMap;

import static java.util.stream.Collectors.*;

public class BigDataReducingWithCollect {

    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    record Person(String firstName, String lastName, BigDecimal salary, String state, char gender) {}
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            TreeMap<String, Map<Character, String>> result = Files.lines(Path.of("/Users/Dave/Downloads/Hr5m.csv")).parallel() // use multiple threads to improve speed
                    .skip(1)
//                    .limit(10)
                    .map(s -> s.split(","))
                    .map(a -> new Person(a[2], a[4], new BigDecimal(a[25]), a[32], a[5].charAt(0)))
                    .collect(
                            groupingBy(Person::state, TreeMap::new,
                                    groupingBy(Person::gender,
                                            collectingAndThen(reducing(BigDecimal.ZERO, Person::salary, (a,b) -> a.add(b)),
                                            moneyFormat::format))
                    ));
//                    .forEach((state, salary) -> System.out.printf("%s -> %s%n", state, salary));

            long endTime = System.currentTimeMillis();
            System.out.println(result);
            System.out.println(endTime - startTime + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
