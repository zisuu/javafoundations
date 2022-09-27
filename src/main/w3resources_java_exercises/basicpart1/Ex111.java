package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 *  111. Write a Java program to add two numbers without using any arithmetic operators.
 *  Given x = 10 and y = 12; result = 22
 */
public class Ex111 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int counter = 0;

        for (int i = 0; i < y; i++) {
            counter++;
        }
        for (int i = 0; i < x; i++) {
            counter++;
        }
        System.out.println(counter);
    }
}
