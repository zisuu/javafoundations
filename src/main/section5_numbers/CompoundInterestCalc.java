package section5_numbers;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

public class CompoundInterestCalc {

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
        BigDecimal balance = CompoundInterestCalc.calculate("$10,000", "8%",10, "$1,000");
        System.out.println(moneyFormatter.format(balance));
    }
}
