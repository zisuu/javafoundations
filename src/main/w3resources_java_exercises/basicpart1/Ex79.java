package w3resources_java_exercises.basicpart1;

/**
 * 79. Write a Java program to rotate an array (length 3) of integers in left direction. Go to the editor
 * Sample Output:
 * 0, 1, 2
 * 0->2, 1->0, 2->1
 * Original Array: [20, 30, 40]
 * Rotated Array: [30, 40, 20]
 */
public class Ex79 {
    public static void main(String[] args) {
        int[] numbers = {20, 30, 40};
        int[] result = {numbers[1],numbers[2], numbers[0]};
    }
}
