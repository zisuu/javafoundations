package section11_loose_ends.datastore;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TimeTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.plusYears(5));
        System.out.println(now.plus(3, ChronoUnit.YEARS));

        LocalDate newYears = LocalDate.of(2020,1,1);
        System.out.println(newYears);
        System.out.println(newYears.getDayOfWeek());
//        newYears.datesUntil(LocalDate.now())
//                .forEach(System.out::println);
        newYears.datesUntil(LocalDate.now(), Period.ofMonths(1))
                .forEach(System.out::println);
    }
}
