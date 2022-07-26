package section8_more_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SuitTest {
    @Test
    void heartPrintsHeart() {
        assertEquals("\u2665", Suit.HEARTS.toString());
    }
}