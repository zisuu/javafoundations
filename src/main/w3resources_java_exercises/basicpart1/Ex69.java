package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 69. Write a Java program to extract the first half of a string of even length. Go to the editor
 * Test Data: Python
 * Sample Output:
 *
 * Pyt
 */
public class Ex69 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your String : ");
        String basicString = in.nextLine();
        String firstHalf = basicString.substring(0, basicString.length()/2);
        System.out.println(firstHalf);
    }
}
