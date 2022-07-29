package section8_more_oop.exercises;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write unit tests to test out the following inputs: a, z, w, f, c, h - which should return: 1, 26, 23, 6, 3, 8 respectively
 */
public class Ex4Test {

    @Test
    void canGetValueOfSomeLetters() {
        String result = "1, 26, 23, 6, 3, 8";
        assertEquals(result, Ex4.getValue("a, z, w, f, c, h"));
    }
}
