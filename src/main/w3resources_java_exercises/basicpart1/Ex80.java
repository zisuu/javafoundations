package w3resources_java_exercises.basicpart1;

/**
 * 80. Write a Java program to get the larger value between first and last element of an array (length 3) of integers.
 * Go to the editor
 * Sample Output:
 *
 * Original Array: [20, 30, 40]
 * Larger value between first and last element: 40
 */
public class Ex80 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40};
        System.out.printf("Larger value between first and last element: %d", Integer.max(numbers[0], numbers[2]));
    }
}
