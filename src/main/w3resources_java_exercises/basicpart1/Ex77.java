package w3resources_java_exercises.basicpart1;

/**
 * 77. Write a Java program to create a new array of length 2 from two arrays of integers with three elements
 * and the new array will contain the first and last elements from the two arrays. Go to the editor
 * Test Data: array1 = 50, -20, 0
 * array2 = 5, -50, 10
 * Sample Output:
 *
 * Array1: [50, -20, 0]
 * Array2: [5, -50, 10]
 * New Array: [50, 10]
 */
public class Ex77 {
    public static void main(String[] args) {
        int[] numbers1 = {50, -20, 0};
        int[] numbers2 = {5, -50, 10};
        int[] result = {numbers1[0], numbers2[numbers2.length-1]};
        for (int number : result) {
            System.out.println(number);
        }
    }
}
