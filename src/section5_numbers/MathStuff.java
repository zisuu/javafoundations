package section5_numbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.security.SecureRandom;
import java.util.Random;

public class MathStuff {
    public static void main(String[] args) {
        System.out.println(3 + 5 + 6); // addition
        System.out.println(3 - 5 - 6); // subtraction
        System.out.println(3 * 5 * 6); // multiplication
        System.out.println(7 / 4); // devision (result will be 1 because java takes those as integers if you just pass whole numbers)
        System.out.println(7.0 / 4.0); // java takes those as double if you enter decials
        System.out.println(7f / 4f); // same is possible with floats
        System.out.println((double)7 / (double)4); // casting is also possible
        System.out.println(1 + 2 * 3);
        System.out.println(5 % 2); // modulo (rest)

        int x = 1;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);

        boolean myFlag = true;
        System.out.println(myFlag);
        myFlag = !myFlag;
        System.out.println(myFlag);

        System.out.println(Math.abs(-5)); // flips from positive to negative and reverse
        System.out.println(Math.ceil(5.0)); // rounds up to next int
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.floor(4.9)); // rounds down to last int
        System.out.println(Math.floor(5.1));
        System.out.println(Math.floor(5.6));

        System.out.println(Math.min(2,3)); // returns the smaller number
        System.out.println(Math.max(2,3)); // returns the bigger number

        System.out.println(Math.pow(2,3)); // Potenzieren

        System.out.println(Math.random()); // default random
        System.out.println(Math.random() * 10); // gives you a random double between 0 and 10
        System.out.println((int)(Math.random() * 10)); // gives you a random double between 0.+ and 10

        System.out.println(Math.round(5.0)); // runden
        System.out.println(Math.round(5.4));
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.999));

        System.out.println(Math.PI); // Pi Konstante
        System.out.println(Math.E); // Eulers Konstante

        Random random = new Random(); // more neutralized random method, not good enough for encryption stuff
        System.out.println(random.nextInt(10)); // Zufallszahl zwischen 0 und 10
        System.out.println(random.nextInt());

        SecureRandom secureRandom = new SecureRandom(); // more neutralized random method
        System.out.println(secureRandom.nextInt(10));

        System.out.println(calcAreaOfCircle(3));
        System.out.println(calcPathVelocity(0.8,3));
        System.out.println(calcCentripetalAccel(1.67, 0.8));
        System.out.println(calcCentripetalForce(.2, 3.504));
        System.out.println(calcCentripetalForce(0.2, 0.8, 3));

        int num1 = 3;
        int num2 = 3;
        System.out.println(num1 == num2);
        int num3 = 4;
        int num4 = 3;
        System.out.println(num3 > num4);
        System.out.println(num3 != num4);


        float numA = 2.15f;
        float numB = 1.10f;
        System.out.println(numA - numB); // by default you should go with the primitives, if the accuracy is good enough

        BigDecimal num5 = new BigDecimal("2.15");
        BigDecimal num6 = new BigDecimal("1.10");
        System.out.println(num5.subtract(num6));

        System.out.println(new BigDecimal("0.4123221").add(new BigDecimal("5.123")));
        System.out.println(new BigDecimal("0.4123221").subtract(new BigDecimal("5.123")));
        System.out.println(new BigDecimal("0.4123221").multiply(new BigDecimal("5.123")));

        MathContext mc = new MathContext(4, RoundingMode.HALF_UP);
        System.out.println(new BigDecimal("0.4123221").divide(new BigDecimal("5.123"), mc)); //divide needs a MathContext in which you tell java how many digits you want
        System.out.println(new BigDecimal("0.4123221").sqrt(mc));
        System.out.println(new BigDecimal("0.4123221").sqrt(mc));
        System.out.println(new BigDecimal("7").max(new BigDecimal("13")));
        System.out.println(new BigDecimal("2").remainder(new BigDecimal(8)));


        BigDecimal bigD1 = new BigDecimal(1024); // not good, because this frist creates a double, better use as a String:
        BigDecimal bigD2 = new BigDecimal("1024"); // not good, because this frist creates a double, better use as a String:
        byte b = bigD2.byteValue();
        System.out.println(b); // exceeds the range of byte
        System.out.println(bigD2.doubleValue());
        System.out.println(bigD2.toString());

        BigInteger bigI1 = new BigInteger("12349343"); // can represent much bigger Ints, if long range is not big enough you can use Big Integer
    }

    /**
     * This Method calcs the area of a circle
     * It uses the formula: A = PI * r^2
     * @param radius
     * @return
     */
    private static double calcAreaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    private static double calcPathVelocity(double radius, double period){
        double circumference = 2 * Math.PI * radius;
        return circumference / period;
    }

    private static double calcCentripetalAccel(double pathVel, double radius){
        return Math.pow(pathVel, 2) / radius;
    }

    private static double calcCentripetalForce(double mass, double acc){
        return mass * acc;
    }

    public static double calcCentripetalForce(double mass, double radius, double period){
        double pathVel = calcPathVelocity(radius, period);
        double centripetalAccel = calcCentripetalAccel(pathVel, radius);
        double centripetalForce = calcCentripetalForce(mass, centripetalAccel);
        return centripetalForce;
    }

}
