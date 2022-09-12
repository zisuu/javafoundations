package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 110. Write a Java program to check whether a given integer is a power of 4 or not. Go to the editor
 * Given num = 64, return true. Given num = 6, return false.
 */
public class Ex110 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int n = in.nextInt();
        //System.out.println(Math.sqrt(n));
        System.out.println(Math.sqrt(n) % 4 == 0);
    }
}
