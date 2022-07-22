package section6_control_flow;

import java.util.Random;

public class WhileLoops1 {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1;
        while (true) {
            String guessedNumStr = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            int guessNum = Integer.parseInt(guessedNumStr);
            if (guessNum == randomNum){
                System.out.printf("The random number was %d. You got it!%n", randomNum);
                return;
            } else {
                System.out.printf("You didn't get it!%n");
            }
        }
    }
}
