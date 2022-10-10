package w3resources_java_exercises.basicpart1;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * Write a Java program to get the first occurrence (Position starts from 0.) of an element of a given array.
 */
public class Ex119 {
    public static void main(String[] args) {
        int[] numbers = {2,5,2,7,3};
        int searchNumber = 7;
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println(i);
            }
        }
    }
}