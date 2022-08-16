package w3resources_java_exercises.basicpart1;

/**
 * 82. Write a Java program to find the largest element between first, last, and middle values from an array
 * of integers (even length). Go to the editor
 * Sample Output:
 *
 * Original Array: [20, 30, 40, 50, 67]
 * Largest element between first, last, and middle values: 67
 */
public class Ex82 {
    public static void main(String[] args) {
//        int[] numbers = {20, 30, 67, 50, 40};
//        int[] numbers = {20, 30, 40, 50, 67};
        int[] numbers = {67, 30, 40, 50, 20};
        int middleIndex = numbers.length /2;
        int biggest = (numbers[0] <= numbers[numbers.length-1]) ? numbers[numbers.length-1] : numbers[0];
        System.out.printf("Largest element between first, last, and middle values: %d", (numbers[middleIndex] <= biggest ? biggest : numbers[middleIndex]));
    }
}
