package w3resources_java_exercises.basicpart1;

/**
 * 78. Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7. Go to the editor
 * Sample Output:
 *
 * Original Array: [5, 7]
 * true
 *
 */
public class Ex78 {
    public static void main(String[] args) {
        int[] numbers = {4, -20};
        if (numbers[0] == 7 || numbers[0] == 4) {
            System.out.println("True");
        } else {
            System.out.println(numbers[1] == 7 || numbers[1] == 4);
        }
    }
}
