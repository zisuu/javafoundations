package section10_streams_and_lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class BigDataSummingGroups {

    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    record Person(String firstName, String lastName, long salary, String state) {}
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
//            Map<String, String> result =
                    Files.lines(Path.of("/Users/Dave/Downloads/Hr5m.csv")).parallel() // use multiple threads to improve speed
                    .skip(1)
//                    .limit(10)
                    .map(s -> s.split(","))
                    .map(a -> new Person(a[2], a[4], Long.parseLong(a[25]), a[32]))
                    .collect(Collectors.groupingBy(Person::state, TreeMap::new,
                            collectingAndThen(summingLong(Person::salary), moneyFormat::format)))
                    .forEach((state, salary) -> System.out.printf("%s -> %s%n", state, salary));

            long endTime = System.currentTimeMillis();
//            System.out.println(result);
//            System.out.printf("$%,d.00%n", result);
            System.out.println(endTime - startTime + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
