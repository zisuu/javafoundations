package section11_loose_ends.datastore;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class BigData {

    record Person(String firstName, String lastName, BigDecimal salary, String state, char gender, LocalDate birthDate, LocalTime birthTime) {
        long getAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }
    }

    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            Files.lines(Path.of("/Users/Dave/Downloads/Hr5m.csv")).parallel() // use multiple threads to improve speed
                    .skip(1)
                    .limit(20)
                    .map(s -> s.split(","))
                    .map(a -> new Person(a[2], a[4], new BigDecimal(a[25]), a[32], a[5].strip().charAt(0),
                            LocalDate.parse(a[10], DateTimeFormatter.ofPattern("M/d/yyyy")),
                            LocalTime.parse(a[11], DateTimeFormatter.ofPattern("hh:mm:ss a"))))
                    .forEach(p -> System.out.printf("%s, %s %s - %d%n", p.lastName, p.firstName, p.birthDate, p.getAge()));
            long endTime = System.currentTimeMillis();
//            System.out.println(result);
            System.out.println(endTime - startTime + "ms");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
