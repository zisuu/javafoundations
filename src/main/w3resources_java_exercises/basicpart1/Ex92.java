package w3resources_java_exercises.basicpart1;

/**
 * 92. Write a Java program to count the number of even and odd elements in a given array of integers.
 */
public class Ex92 {
    public static void main(String[] args) {
        Integer[] myNumbers = {3,5,2,6,235,57,345,235,456,33};
        int counterEven = 0;
        int counterOdd = 0;
        for (Integer number : myNumbers) {
            if (number % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }
        System.out.printf("counterEven: %d counterOdd: %d%n", counterEven,counterOdd);
    }
}
