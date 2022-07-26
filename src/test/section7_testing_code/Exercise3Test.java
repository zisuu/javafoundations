package section7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise3Test {

    @Test
    public void trailMix() {
        String spoon = Exercise3.spoonerize("tra mix");
        assertEquals("mra tix", spoon);
    }

    @Test
    public void soundBite() {
        String spoon = Exercise3.spoonerize("sound bite");
        assertEquals("bound site", spoon);
    }

    @Test
    public void flatCap() {
        String spoon = Exercise3.spoonerize("fla cap");
        assertEquals("cla fap", spoon);
    }

    @Test
    public void sadBallad() {
        String spoon = Exercise3.spoonerize("sad bad");
        assertEquals("bad sad", spoon);
    }

    @Test
    public void masterPlan() {
        String spoon = Exercise3.spoonerize("mast plan");
        assertEquals("past mlan", spoon);
    }

    @Test
    public void trailSnacks() {
        String spoon = Exercise3.spoonerize("trail snack");
        assertEquals("srail tnack", spoon);
    }
}
