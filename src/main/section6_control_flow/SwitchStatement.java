package section6_control_flow;

import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is: %d.%n", randomNum);

        switch (randomNum) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is BLUE");
                break;
            case 3:
                System.out.println("The color is GREEN");
                break;
            case 4:
                System.out.println("The color is PURPLE");
                break;
            default:
                System.out.println("The color is WHATEVER");
                break;
        }
    }
}
