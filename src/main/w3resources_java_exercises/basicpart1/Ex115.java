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
        String input = in.nextLine();
        String[] numberAsStringArray = input.split(",");
        int[] numbers = new int [numberAsStringArray.length];
        for (int i = 0; i < numberAsStringArray.length; i++) {
            numbers[i] = Integer.parseInt(numberAsStringArray[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
