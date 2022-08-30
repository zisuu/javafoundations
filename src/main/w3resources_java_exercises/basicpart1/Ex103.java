package w3resources_java_exercises.basicpart1;
import java.util.Arrays;
/**
 * 103. Write a Java program to create a new array from a given array of integers, new array will contain
 * the elements from the given array after the last element value 10.
 */
public class Ex103 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,10,20,20,21,102,10,20,21,0};
        int index = 0;
        for (int i = inputNumbers.length -1; i > 0 && inputNumbers[i] != 10; i--) {
            index = i;
        }
        Integer[] newArray = Arrays.copyOfRange(inputNumbers, index, inputNumbers.length);
        System.out.println(Arrays.toString(newArray));
    }
}