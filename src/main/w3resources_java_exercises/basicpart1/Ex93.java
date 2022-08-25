package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 * 93. Write a Java program to test if an array of integers contains an element 10 next to 10
 * or an element 20 next to 20, but not both.
 */
public class Ex93 {
    public static void main(String[] args) {
        Integer[] myNumbers = {3,5,2,20,20,57,345,11,10,33};
        boolean found1010 = false;
        boolean found2020 = false;
        for (int i = 0; i < myNumbers.length-1; i++) {
            if (myNumbers[i] == 10 && myNumbers[i+1] == 10) {
                found1010 = true;
            }
            if (myNumbers[i] == 20 && myNumbers[i+1] == 20) {
                found2020 = true;
            }
        }
        System.out.println(found1010 != found2020);
    }
}
