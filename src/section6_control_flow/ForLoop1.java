package section6_control_flow;

import java.util.Random;

public class ForLoop1 {

    public static final int MAX_ALLOWED_TRIED = 4;

    public static void main(String[] args) {

        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("Number: %d", randomNum);
        String guessedNumStr = null;
        int wrongGuessCount;
        for (wrongGuessCount = 1; wrongGuessCount <= MAX_ALLOWED_TRIED; wrongGuessCount++) {
            guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumStr.matches("-?\\d{1,2}")) {
                int guessNum = Integer.parseInt(guessedNumStr);
                if (guessNum == randomNum){
                    String tryText = wrongGuessCount == 1 ? "time" : "times";
                    System.out.printf("The random number was %d. You got it! You have guessd %d %s.%n", randomNum, wrongGuessCount, tryText);
                    break;
                } else {
                    System.out.printf("You didn't get it!%n");
                }
            }
        }
        if (wrongGuessCount >= MAX_ALLOWED_TRIED) {
            System.out.printf("you've had %d incorrect guesses. Only 4 guesses are allowed. Exiting program now%n", wrongGuessCount -1);
        }
    }
}
