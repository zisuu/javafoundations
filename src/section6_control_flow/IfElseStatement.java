package section6_control_flow;

import java.util.Random;

public class IfElseStatement {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is: %d.%n", randomNum);

        if (randomNum == 1) {
            System.out.println("The color is Red");
        } else if (randomNum == 2) {
            System.out.println("The color is Blue");
        } else if (randomNum == 3) {
            System.out.println("The color is Green");
        } else if (randomNum == 4) {
            System.out.println("The color is Purple");
        } else {
            System.out.println("The color is WHATEVER");
        }
    }
}
