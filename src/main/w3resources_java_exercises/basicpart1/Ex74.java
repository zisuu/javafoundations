package w3resources_java_exercises.basicpart1;

/**
 * 74. Write a Java program to test if 10 appears as either the first or last element of an array of integers.
 * The length of the array must be greater than or equal to 2. Go to the editor
 * Sample Output:
 * Test Data: array = 10, -20, 0, 30, 40, 60, 10
 *
 * true
 */
public class Ex74 {
    public static void main(String[] args) {
        int[] numbers = {20, -20, 0, 30, 40, 60, 10};
        System.out.println((numbers.length >= 2 && numbers[0] == 10 || numbers[numbers.length-1] == 10));
    }
}
