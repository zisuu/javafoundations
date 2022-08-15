package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string.
 * The length of the original string must be 3 and above.
 * Sample Output:
 *
 * 3.03.03.03.0
 */
public class Ex68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your String : ");
        String basicString = in.nextLine();
        if (basicString.length() >= 3) {
            String last3Chars = basicString.substring(basicString.length()-3);
            System.out.println(last3Chars.concat(last3Chars).concat(last3Chars).concat(last3Chars));
        } else {
            System.out.println("The length of the original string must be 3 and above");
        }
    }
}
