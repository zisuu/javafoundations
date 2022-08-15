package w3resources_java_exercises.basicpart1;

/**
 * 76. Write a Java program to test if the first or the last element of two array of integers are same.
 * The length of the array must be greater than or equal to 2. Go to the editor
 * Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
 * array2 = 45, 20, 10, 20, 30, 50, 11
 * Sample Output:
 *
 * false
 */
public class Ex76 {
    public static void main(String[] args) {
        int[] numbers1 = {50, -20, 0, 30, 40, 60, 12};
        int[] numbers2 = {45, 20, 10, 20, 30, 50, 11};
        if (numbers1.length >= 2 && numbers2.length >= 2){
            System.out.println(numbers1[0] == numbers2[0] || numbers1[numbers1.length-1] == numbers2[numbers2.length-1]);
        } else {
            System.out.println("The length of the array must be greater than or equal to 2");
        }
    }
}
