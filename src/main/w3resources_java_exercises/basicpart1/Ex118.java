package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 * 118. Write a Java program to get the first occurrence (Position starts from 0.) of a string within a given string.
 */
public class Ex118 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a given String: ");
        String givenString = in.nextLine();
        System.out.print("Input a search String: ");
        String searchString = in.nextLine();
        System.out.println(givenString.indexOf(searchString));
    }
}
