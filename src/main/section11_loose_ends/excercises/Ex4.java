package section11_loose_ends.excercises;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * Assuming you captured user input of a date/time into a String like “July 12, 1984 13:47:00”
 * and assuming that date/time occurred at GMT-8, write code to parse that String and convert it to GMT-0.
 */
public class Ex4 {
    public static void main(String[] args) {
        String input = "July 12, 1984 13:47:00";
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy kk:mm:ss");
        TemporalAccessor dateTime = df.parse(input);
        System.out.println(df.format(dateTime));
        ZonedDateTime zInputDate = ZonedDateTime.of(LocalDateTime.from(dateTime), ZoneId.of("-8"));
        System.out.println(zInputDate);
        System.out.println(zInputDate.withZoneSameInstant(ZoneId.of("+0")));

        // 3.1: What would that same date/time be after 179 days, 7 hours and 27 minutes in Japan?
        ZonedDateTime japan = zInputDate.plusDays(179).plusHours(7).plusMinutes(27).withZoneSameInstant(ZoneId.of("Asia/Tokyo"));
        System.out.println(japan);
    }
}
