package section7_testing_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuessingGameTest {

    public static final int GAME_RANDOM_RETRIES = 100;
    private GuessingGame game;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
    }

    @Test
    public void testSimpleWinSituation(){
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum);
        assertEquals("You got it in 1 try", message);
    }

    @Test
    public void testOneWrongNegGuessSituation(){
        String message = game.guess(-5);
        assertEquals("You didn't get it - you're too low", message);
    }

    @Test
    public void testOneWrongPosGuessSituation(){
        int randomNum = game.getRandomNumber();
        String message = game.guess(randomNum +1);
        assertEquals("You didn't get it - you're too high", message);
    }

    @RepeatedTest(10)
    public void testRandomNumberGeneration(){
        // 1 2 3 4 5 6 7 8 9 10
        // 1 1 1 1 0 1 0 1 1 1 = 10
        int[] rndNumCount = new int [11];
        for (int counter = 0; counter < GAME_RANDOM_RETRIES; counter++){
            GuessingGame game = new GuessingGame();
            int randomNum = game.getRandomNumber();
            rndNumCount[randomNum] = 1;
        }

        int sum = 0;
        for (int counter = 0; counter < 11; counter++) {
            sum += rndNumCount[counter];
        }
        assertEquals(10, sum);
    }

    @Test
    public void testTenWrongGuesses(){
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("You are limited to only 4 tries. Your Game is over.", message);
    }

    @Test
    public void testFourWrongGuesses(){
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        String message = game.guess(-3);
        assertEquals("You didn't get it and you've had 4 tries. Game over.", message);
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect(){
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
        int  correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
        assertEquals("You got it in 4 tries", message);
    }

    @Test
    public void testTwoWrongGuessesAndOneCorrect(){
        game.guess(-3);
        game.guess(-3);
        int  correctAnswer = game.getRandomNumber();
        String message = game.guess(correctAnswer);
        assertTrue(message.contains(" 3 "), "should indicate 3 tries");
        assertTrue(message.contains("You got it"), "should indicate that we got it");
    }

}
