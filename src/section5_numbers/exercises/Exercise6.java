package section5_numbers.exercises;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Write a function that takes a String like “149.32” and formats it as money for wherever
 * you live. So, if you live in the United States, it would return “$149.32”,
 * Korea = ₩149, France/ EU = 149,32 €, etc.
 */
public class Exercise6 {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        String input = "149.32";
        Double myDouble = Double.valueOf(input);
        System.out.println(moneyFormatter.format(myDouble));
    }
}
