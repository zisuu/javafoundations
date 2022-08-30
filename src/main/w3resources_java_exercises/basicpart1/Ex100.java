package w3resources_java_exercises.basicpart1;

/**
 * 100. Write a Java program to count the two elements of two given arrays of integers with same length, differ by 1 or less.
 */
public class Ex100 {
    public static void main(String[] args) {
        Integer[] inputNumbers1 = {2,3,10,20,20,21,10};
        Integer[] inputNumbers2 = {2,5,9,20,19,11,10};
        int counter = 0;
        for (int i = 0; i < inputNumbers1.length; i++) {
            if(Math.abs(inputNumbers1[i] - (inputNumbers2[i])) <= 1 && inputNumbers1[i] != inputNumbers2[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
