package section7_testing_code;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10) +1;
    private int counter = 0;

    public String guess(int guessedInt) {
        counter++;
        String tryText = counter == 1 ? "try" : "tries";
        String winningMsg = String.format("You got it in %d %s", counter, tryText);
        String response = null;
        if (counter == 4 && guessedInt != getRandomNumber()) {
            response =  String.format("You didn't get it and you've had %d %s. Game over.", counter, tryText);
        } else if (counter > 4){
            response =  String.format("You are limited to only 4 tries. Your Game is over.");
        } else{
            String tooHighLowText = null;
            if (guessedInt < getRandomNumber()){
                tooHighLowText = "you're too low";
            } else if (guessedInt > getRandomNumber()){
                tooHighLowText = "you're too high";
            } else {
                tooHighLowText = "";
            }
            String loseText = String.format("You didn't get it - %s", tooHighLowText).strip();
            response =  guessedInt == getRandomNumber() ? winningMsg : loseText;
        }
        return response;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        boolean loopShouldContinue = true;
        do {
            String input = System.console().readLine("Enter a number: ");
            if ("q".equals(input)){
                return;
            }
            String output = game.guess(Integer.parseInt(input));
            System.out.println(output);
            if (output.contains("You got it") || output.contains("over")){
                loopShouldContinue = false;
            }
        } while (loopShouldContinue);
    }
}
