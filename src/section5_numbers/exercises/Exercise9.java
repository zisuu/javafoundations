package section5_numbers.exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Use printf() to format the following inputs to print out the following outputs
 *
 */
public class Exercise9 {

    public static void main(String[] args) throws ParseException {

        String v1 = String.format("$%,.2f%n", 123456.783);
        String v2 = String.format("%,(.3f%n", -9876.32532);
        String v3 = String.format("%ef%n", 23.19283928394829182);
        String v4 = String.format("%010d%n", 123456);
        String v5 = String.format("%,+.1f%n", -9876.35532);

        System.out.print(v1);
        System.out.print(v2);
        System.out.print(v3);
        System.out.print(v4);
        System.out.print(v5);
    }

}
