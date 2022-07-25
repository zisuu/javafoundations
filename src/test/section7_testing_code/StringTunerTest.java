package section7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTunerTest {

    private StringTuner tuner;

    @BeforeEach
    void setUp() {
        tuner = new StringTuner();
    }

    @Test
    public void testSingleSting(){
        String input = "hello";
        String output = tuner.uppercaseUneven(input);
        assertEquals("hElLo", output);
    }

    @Test
    public void testMulipleSting(){
        String input = "hello you there";
        String output = tuner.uppercaseUneven(input);
        assertEquals("Could not parse String, only single word is allowed", output);
    }

    @Test
    public void invalidSting(){
        String input = "1- ! there";
        String output = tuner.uppercaseUneven(input);
        assertEquals("Could not parse String, only chars from Aa-Zz are allowed!", output);
    }
}
