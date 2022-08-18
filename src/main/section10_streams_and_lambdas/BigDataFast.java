package section10_streams_and_lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class BigDataFast {
//    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Long result = Files.lines(Path.of("/Users/Dave/Downloads/Hr5m.csv")).parallel() // use multiple threads to improve speed
                    .skip(1)
//                    .limit(10)
                    .map(s -> s.split(","))
                    .map(arr -> arr[25])
//                    .forEach(System.out::println);
                    .collect(Collectors.summingLong(sal -> Long.parseLong(sal)));

            long endTime = System.currentTimeMillis();
//            System.out.println(moneyFormat.format(result));
            System.out.printf("$%,d.00%n", result);
            System.out.println(endTime - startTime + "ms");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
