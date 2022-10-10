package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 117. Write a Java program to compute the square root of a given integer.
 * Input a positive integer: 25
 * Square root of 25 is: 5
 */
public class Ex117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int input = in.nextInt();
        System.out.println("Square root of 25 is: " + Math.sqrt(input));
    }
}
