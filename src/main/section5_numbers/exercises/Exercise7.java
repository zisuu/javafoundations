package section5_numbers.exercises;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Write a function that takes a String input of “$12,345.83” and prints out that value divided by 32.19.
 * It should return $383.53.
 */
public class Exercise7 {

    public static void main(String[] args) throws ParseException {
//
//        String regex = "\\$(\\d+)(,*)(\\d+.\\d{2})*";
//        String input = "$12,345.83";
//
//        Pattern pat = Pattern.compile(regex);
//        Matcher mat = pat.matcher(input);
//
//        if (mat.matches()){
////            System.out.format("entire String: %s\n", mat.group(0));
////            System.out.format("Number1: %s\n", mat.group(1));
////            System.out.format("Number2: %s\n", mat.group(3));
//            Double myDouble = Double.valueOf(mat.group(1).concat(mat.group(3)));
//
//            System.out.println(moneyFormatter.format(myDouble / 32.19));
//        }

        System.out.println(calc("$12,345.83"));
    }

    public static String calc(String formattedMoney) throws ParseException{
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        Number value = moneyFormatter.parse(formattedMoney);
        BigDecimal result = new BigDecimal(value.toString()).divide(new BigDecimal("32.19"), MathContext.DECIMAL32);
        return moneyFormatter.format(result);
    }
}
