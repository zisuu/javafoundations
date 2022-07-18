package section5_numbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CompoundInterestCalc {

    public static BigDecimal calculate(String principal, String rate, int period, String contribution){
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rate)).pow(period); // (1+r)^^period
        //BigDecimal b = a.multiply(new BigDecimal(period)); // (1+r)Y
        BigDecimal c = a.subtract(BigDecimal.ONE);
        BigDecimal d = c.divide(new BigDecimal(rate));
        BigDecimal e = d.multiply(new BigDecimal(contribution));
        BigDecimal f = a.multiply(new BigDecimal(principal));
        BigDecimal g = f.add(e);
        return g;
    }

    public static void main(String[] args) {
        BigDecimal balance = CompoundInterestCalc.calculate("10000.00", "0.08",10, "1000");
        System.out.println(balance);
    }
}
