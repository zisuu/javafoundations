package section8_more_oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RankTest {

    @Test
    void getValueOfKing() {
        assertEquals(10, Rank.KING.getValue());
    }

}