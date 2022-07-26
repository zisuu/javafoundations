package section7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1Test {

    private Exercise1 tuner;

    @BeforeEach
    void setUp() {
        tuner = new Exercise1();
    }

    @Test
    public void testSingleSting(){
        String input = "hello";
        String output = tuner.uppercaseUneven(input);
        assertEquals("hElLo", output);
    }

    @Test
    public void testMulipleSting(){
        String input = "cat";
        String output = tuner.uppercaseUneven(input);
        assertEquals("cAt", output);
    }

    @Test
    public void testAlternateCapsWithBlank() {
        String output = tuner.uppercaseUneven("");
        assertEquals("", output);
    }


    @Test
    public void testAlternateCapsWithAllCapsApple() {
        String output = tuner.uppercaseUneven("APPLE");
        assertEquals("APPLE", output);
    }
}
