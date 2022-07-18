package section5_numbers;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoundInterestCalcCustomFormat {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance();

    public static BigDecimal calculate(String principal, String rate, int period, String contribution) throws ParseException {
        String rateAsPercent = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); // (1+r)^^period
        BigDecimal c = a.subtract(BigDecimal.ONE);
        BigDecimal d = c.divide(new BigDecimal(rateAsPercent));
        BigDecimal e = d.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString()));
        BigDecimal f = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString()));
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) throws ParseException {
        DecimalFormat df = new DecimalFormat("$#,###.00;$(#)");
        DecimalFormat pf = new DecimalFormat("#%");
        BigDecimal balance = CompoundInterestCalcCustomFormat.calculate("$10,000", "8%",10, "$1,000");
        //System.out.println(df.format(balance));
        //System.out.println(pf.format(.08));
        System.out.printf("$%,(.2f%n", balance);
    }
}
