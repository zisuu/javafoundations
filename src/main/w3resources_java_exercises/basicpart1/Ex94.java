package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 94. Write a Java program to rearrange all the elements of a given array of integers so that
 * all the odd numbers come before all the even numbers.
 */
public class Ex94 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,5,2,20,20,57,345,11,10,33};

        int i = 0;
        System.out.println("Original Array: "+ Arrays.toString(inputNumbers));
        while(i < inputNumbers.length && inputNumbers[i] % 2 == 0)
            i++;

        for (int j = i + 1; j < inputNumbers.length; j++) {
            if (inputNumbers[j] % 2 == 0) {
                int temp = inputNumbers[i];
                inputNumbers[i] = inputNumbers[j];
                inputNumbers[j] = temp;
                i++;
            }
        }
        System.out.println("New Array: "+ Arrays.toString(inputNumbers));
    }
}
