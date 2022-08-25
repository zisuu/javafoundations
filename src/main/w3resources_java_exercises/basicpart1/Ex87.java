package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 87. Write a Java program than read an integer and calculate the sum of its digits and write the
 * number of each digit of the sum in English
 */
public class Ex87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your integer : ");
        String input = in.nextLine();
        try {
            int inputInt = Integer.parseInt(input);
            calcSum(inputInt);
        }
        catch (NumberFormatException e) {
            System.out.println(input + " is not a valid integer");
        }
    }

    private static void calcSum(int input) {
        int x; int y; int z;
        String[] number = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int sum = 0;
        while (input > 0){
            sum += input % 10;
            input /= 10;
        }
        if (sum < 10) {
            System.out.printf("The sum of the digits is: %d%n", sum);
            System.out.printf("The sum of the digits is: %s%n", number[sum]);
        } else if (sum < 100) {
            x = sum / 10;
            y = sum - x *10;
            System.out.printf("The sum of the digits is: %d%n", sum);
            System.out.printf("The sum of the digits is: %s %s%n", number[x], number[y]);
        }
    }
}
