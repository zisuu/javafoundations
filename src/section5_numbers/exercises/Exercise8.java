package section5_numbers.exercises;

import section5_numbers.CompoundInterestCalcCustomFormat;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Use printf() to format the following inputs to print out the following outputs
 *
 */
public class Exercise8 {

    public static void main(String[] args) throws ParseException {
        System.out.printf("$%,.2f%n", 123456.783);
        System.out.printf("%,(.3f%n", -9876.32532);
        System.out.printf("%ef%n", 23.19283928394829182);
        System.out.printf("%010d%n", 123456);
        System.out.printf("%,+.1f%n", -9876.35532);

    }

}
