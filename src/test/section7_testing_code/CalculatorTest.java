package section7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    public void canAddZeroPlusZero(){
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canSubtractZeroMinusZero(){
        int sum = calc.subtract(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canMultiplyZeroAndZero(){
        int sum = calc.multiply(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    @Disabled
    public void canDivideZeroAndZero(){
        int sum = calc.divide(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne(){
        int sum = calc.add(1, 1);
        assertEquals(2, sum, "Was expecting sum of 2");
    }

    @Test
    public void canSubtractOneMinusOne(){
        int sum = calc.subtract(1, 1);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void canMultiplyOneAndOne(){
        int sum = calc.multiply(1, 1);
        assertEquals(1, sum, "Was expecting sum of 1");
    }

    @Test
    public void canDivideOneAndOne(){
        int sum = calc.divide(1, 1);
        assertEquals(1, sum, "Was expecting sum of 1");
    }

    @Test
    public void canAddOneNegativeNumber(){
        int sum = calc.add(10, -5);
        assertEquals(5, sum, "Was expecting sum of -5");
    }

    @Test
    public void canAddTwoNegativeNumbers(){
        int sum = calc.add(-10, -5);
        assertEquals(-15, sum, "Was expecting sum of -15");
    }

    @Test
    public void canSubtractOneNegativeNumber(){
        int sum = calc.subtract(10, -5);
        assertEquals(15, sum, "Was expecting sum of -15");
    }

    @Test
    public void canSubtractTwoNegativeNumbers(){
        int sum = calc.subtract(-10, -5);
        assertEquals(-5, sum, "Was expecting sum of -5");
    }

    @Test
    public void canMultiplyOneNegativeNumber(){
        int sum = calc.multiply(10, -5);
        assertEquals(-50, sum, "Was expecting sum of -50");
    }

    @Test
    public void canMultiplyTwoNegativeNumbers(){
        int sum = calc.multiply(-10, -5);
        assertEquals(50, sum, "Was expecting sum of 50");
    }

    @Test
    public void canDivideOneNegativeNumber(){
        int sum = calc.divide(10, -5);
        assertEquals(-2, sum, "Was expecting sum of -2");
    }

    @Test
    public void canDivideTwoNegativeNumbers(){
        int sum = calc.divide(-10, -5);
        assertEquals(2, sum, "Was expecting sum of 2");
    }

    @Test
    @Disabled
    public void canAddMaxIntPlusOne(){
        int sum = calc.add(Integer.MAX_VALUE, 1);
        System.out.println(sum);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, "0.06", 1);
        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityExample2() {
        String answer = calc.calcAnnuity("1200", 10, "0.08", 4);
        assertEquals("$72,482.38", answer);
    }
}
