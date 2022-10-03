package w3resources_java_exercises.basicpart1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *     115. Write a Java program to check if a positive number is a palindrome or not.
 *     Input a positive integer: 151
 *     Is 151 is a palindrome number?
 *             true
 */
public class Ex115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int input = in.nextInt();
        String text = String.valueOf(input);
        int inputLength = String.valueOf(input).length();
        int[] numbers = new int [inputLength];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(text.substring(i,i+1));
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < inputLength-1; i++) {
            if (numbers[i] == numbers[inputLength-(i+1)]) {
                System.out.println(i + " = true");
            } else {
                break;
            }
        }
    }
}
