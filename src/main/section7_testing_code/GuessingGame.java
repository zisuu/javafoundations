package section7_testing_code;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10) +1;
    private int counter = 0;

    public String guess(int guessedInt) {
        counter++;
        if (counter == 4 && guessedInt != getRandomNumber()) {
            return "You didn't get it and you've had four tries. Game over.";
        }

        String tryText = counter == 1 ? "try" : "tries";
        String winningMsg = String.format("You got it in %d %s", counter, tryText);
        return guessedInt == getRandomNumber() ? winningMsg : "You didn't get it";
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
