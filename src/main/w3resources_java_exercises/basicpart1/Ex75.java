package w3resources_java_exercises.basicpart1;

/**
 * 75. Write a Java program to test if the first and the last element of an array of integers are same.
 * The length of the array must be greater than or equal to 2. Go to the editor
 * Test Data: array = 50, -20, 0, 30, 40, 60, 10
 * Sample Output:
 *
 * false
 */
public class Ex75 {
    public static void main(String[] args) {
        int[] numbers = {10, -20, 0, 30, 40, 60, 10};
        System.out.println(numbers.length >= 2 && (numbers[0] == numbers[numbers.length-1]));
    }
}
