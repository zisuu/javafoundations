package w3resources_java_exercises.basicpart1;

/**
 * 128.Write a Java program to calculate the median of a given unsorted array of integers. Go to the editor
 * Original array: [10, 2, 38, 22, 38, 23]
 * Median of the said array of integers: 30
 * Original array: [10, 2, 38, 23, 38, 23, 21]
 * Median of the said array of integers: 23
 */
public class Ex128 {
    private static Integer[] array = {10, 2, 38, 22, 38, 23};
    //private static Integer[] array = {10, 2, 38, 23, 38, 23, 21};

    public static void main(String[] args) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println("Average of the said array of integers: " + sum / array.length);
        int median = 0;
        median = (array[array.length/2-1]+array[array.length/2])/2;
        System.out.println("Median of the said array of integers: " + median);
    }
}
