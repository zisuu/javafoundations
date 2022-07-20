package section5_numbers.exercises;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Use printf() to format the following inputs to print out the following outputs
 *
 */
public class Exercise10 {

    public static void main(String[] args) throws ParseException {
        System.out.println(new DecimalFormat("$,###.##").format(123456.783)); // you could also do "$#,###.##"
        System.out.println(new DecimalFormat(",###.###;(#)").format(-9876.32532));
        System.out.println(new DecimalFormat("0.######E00f").format( 23.19283928394829182)); // not possible to get the plus sign in "...e+01f" with format string
        System.out.println(new DecimalFormat("0000000000").format(123456));
        System.out.println(new DecimalFormat(",###.#;-").format(-9876.35532));
    }

}
