package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 72. Write a Java program to create a new string taking first three characters from a given string.
 * If the length of the given string is less than 3 use "#" as substitute characters. Go to the editor
 * Test Data: Str1 = " "
 * Sample Output:
 *
 * ###
 */
public class Ex72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your String : ");
        String inputString = in.nextLine();
        if (inputString.length() < 3) {
            System.out.println("###");
        } else {
            System.out.println(inputString.substring(0,3));
        }
    }
}
