package section11_loose_ends.excercises;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * How much will have elapsed if you depart from Seoul, South Korea at 13:15:00 February 3, 2022 and
 * arrive in London, UK at 20:02:13, February 3, 2022?
 */
public class Ex6 {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("kk:mm:ss MMMM d, YYYY");

        ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2022, 2, 3, 13, 15, 00), ZoneId.of("Asia/Seoul"));
        ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2022, 2, 3, 20, 02, 13), ZoneId.of("Europe/London"));
        Duration diffTime = Duration.between(departure, arrival);
        System.out.printf("%d hours %d minutes %d seconds%n", diffTime.toHoursPart(), diffTime.toMinutesPart(), diffTime.toSecondsPart());
        System.out.println(arrival.withZoneSameInstant(ZoneId.of("America/Los_Angeles")));
    }
}
