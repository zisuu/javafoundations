package section8_more_oop.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Write unit tests to test out the following inputs: a, z, w, f, c, h - which should return: 1, 26, 23, 6, 3, 8 respectively
 */
public class Ex5Test {

    @Test
    void canGetA() {
        char a = Ex5.convert(1);
        assertEquals('a', a);
    }

    @Test
    void canGetS() {
        char s = Ex5.convert(19);
        assertEquals('s', s);
    }

    @Test
    void canGetZ() {
        char z = Ex5.convert(26);
        assertEquals('z', z);
    }
}
