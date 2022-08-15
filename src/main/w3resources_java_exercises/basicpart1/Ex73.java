package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 73. Write a Java program to create a new string taking first and last characters from two given strings.
 * If the length of either string is 0 use "#" for missing character. Go to the editor
 * Test Data: str1 = "Python"
 * str2 = " "
 * Sample Output:
 *
 * P#
 */
public class Ex73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your first String : ");
        String inputString1 = in.nextLine();
        System.out.print("Input your second String : ");
        String inputString2 = in.nextLine();
        String result = "";
        result += (inputString1.length() >= 1) ? inputString1.charAt(0) : "#";
        result += (inputString2.length() >= 1) ? inputString2.charAt(inputString2.length()-1) : "#";
        System.out.println(result);
    }
}
