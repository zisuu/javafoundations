package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
 */
public class Ex107 {
    public static void main(String[] args) {
        Integer[] myNumbers = {11, 15, 13, 10, 45, 20};

        Integer[] result = new Integer[myNumbers.length];
        for (int i = 0; i < myNumbers.length; i++) {
            if (i == myNumbers.length -1) {
                result[myNumbers.length-1] = myNumbers[0];
            } else {
                result[i] = myNumbers[i+1];
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
