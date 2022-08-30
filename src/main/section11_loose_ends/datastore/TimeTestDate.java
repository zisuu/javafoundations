package section11_loose_ends.datastore;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeTestDate {
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

        LocalDate ld1 = LocalDate.of(2000,1,1);
        LocalTime lt1 = LocalTime.of(10,30);
        LocalDate ld2 = LocalDate.of(2002,6,10);
        LocalTime lt2 = LocalTime.of(13,57,39);

        LocalDateTime ltd1 = LocalDateTime.of(ld1,lt1);
        LocalDateTime ltd2 = LocalDateTime.of(ld2,lt2);
        System.out.println(ltd1.equals(ltd2));

        System.out.println(Instant.now());

        Period diff1 = Period.between(ld1, ld2);
        System.out.printf("%d years, %d months, %d days%n", diff1.getYears(), diff1.getMonths(), diff1.getDays());

        Duration diff = Duration.between(lt1, lt2);
        System.out.printf("%d hours, %d minutes, %d seconds%n", diff.toHours(), diff.toMinutes(), diff.toSeconds());
        System.out.printf("%d hours, %d minutes, %d seconds%n", diff.toHoursPart(), diff.toMinutesPart(), diff.toSecondsPart());

        LocalTime now2 = LocalTime.now();
        System.out.println(now2);

        System.out.println(lt1.equals(lt2));

        System.out.println(ZonedDateTime.of(ltd1, ZoneId.systemDefault()));
        System.out.println(ZonedDateTime.of(ltd1, ZoneId.of("-5")));

        LocalDateTime xmas = LocalDateTime.of(2022,12,25,12,00);
        // Switzerland - GMT+01
        ZonedDateTime zxmas = ZonedDateTime.of(xmas, ZoneId.of("+1"));
        System.out.println(zxmas.withZoneSameInstant(ZoneId.of("+0")));

        System.out.println(ld1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));

        System.out.println(ld1.withMonth(3).withDayOfMonth(15));
    }
}
