package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 107. Write a Java program to check if an array of integers contains three increasing adjacent numbers.
 */
public class Ex107 {
    public static void main(String[] args) {
        Integer[] myNumbers = {11, 15, 16, 17, 45, 20};

        Boolean result = false;
        for (int i = 0; i < myNumbers.length -2; i++) {
            if (myNumbers[i] == (myNumbers[i+1] -1) && myNumbers[i] == (myNumbers[i+2] -2)) {
                    result = true;
                }
            }
        System.out.println(result);
    }
}
