package section6_control_flow;

import java.util.Random;

public class DoWhileLoops1 {
    public static void main(String[] args) {
        int wrongGuessCount = 1;
        int randomNum = new Random().nextInt(10) + 1;
        System.out.printf("Number: %d", randomNum);
        String guessedNumStr = null;
        do {
            guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumStr.matches("-?\\d{1,2}")) {
                int guessNum = Integer.parseInt(guessedNumStr);
                if (guessNum == randomNum){
                    String tryText = wrongGuessCount == 1 ? "time" : "times";
                    System.out.printf("The random number was %d. You got it! You have guessd %d %s.%n", randomNum, wrongGuessCount, tryText);
                    return;
                } else {
                    wrongGuessCount++;
                    System.out.printf("You didn't get it!%n");
                }
            }
        } while (!"q".equals(guessedNumStr));
    }
}
