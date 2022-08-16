package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 81. Write a Java program to swap the first and last elements of an array (length must be at least 1)
 * and create a new array. Go to the editor
 * Sample Output:
 *
 * Original Array: [20, 30, 40]
 * New array after swaping the first and last elements: [40, 30, 20]
 */
public class Ex81 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40};
        int lastNumber = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = lastNumber;
        System.out.println("New array after swaping the first and last elements: " + Arrays.toString(numbers));
    }
}
