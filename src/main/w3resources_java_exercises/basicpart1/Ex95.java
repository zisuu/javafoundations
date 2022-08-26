package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 95. Write a Java program to create an array (length # 0) of string values.
 * The elements will contain "0", "1", "2" … through ... n-1.
 */
public class Ex95 {
    public static void main(String[] args) {
        int input = 5;
        String[] myArray = new String[input];

        for (int i = 0; i < input; i++) {
            myArray[i] = String.valueOf(i);
        }
        System.out.println(Arrays.toString(myArray));
    }
}
