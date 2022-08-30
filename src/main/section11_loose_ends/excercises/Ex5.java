package section11_loose_ends.excercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Write code to determine the current age of your own country.
 */
public class Ex5 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(1292, 8, 1);
        Period diff1 = Period.between(ld1, LocalDate.now());
        System.out.printf("%d years%n", diff1.getYears());

        // 5.1: Write code to determine your own age exactly
        LocalDate ld2 = LocalDate.of(100, 1, 1);
        Period diff2 = Period.between(ld2, LocalDate.now());
        System.out.printf("%d years %d month %d days%n", diff2.getYears(), diff2.getMonths(), diff2.getDays());

        // 5.2: Write code to determine how many days until the next New Year (or any holiday you
        //choose). Note/hint: ChronoUnit has enums for various time intervals which also have
        //useful methods.
        LocalDate ld3 = LocalDate.of(2023, 1, 1);
        long daysToNewYear = ChronoUnit.DAYS.between(LocalDate.now(), ld3);
        System.out.printf("%d days%n", daysToNewYear);

        // 5.3: If you began an activity at 9:37:20 and stopped at 19:13:41, how best can you write code to determine how much time elapsed?
        LocalTime start = LocalTime.of(9,37,20);
        LocalTime end = LocalTime.of(19,13,41);
        Duration diffTime = Duration.between(start, end);
        System.out.printf("%d hours %d minutes %d seconds%n", diffTime.toHoursPart(), diffTime.toMinutesPart(), diffTime.toSecondsPart());
    }
}
