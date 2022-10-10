package w3resources_java_exercises.basicpart1;

/**
 * 124. Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.
 * Example:
 * [1, 2, 4, 5, 6] 5(searchNumber) -> 3(index)
 * [1, 2, 4, 5, 6] 0(searchNumber) -> 0(index)
 * [1, 2, 4, 5, 6] 7(searchNumber) -> 5(index)
 */
public class Ex124 {
    private static int[] numbers = {1, 2, 4, 5, 6};
    private static int searchNumber = 0;

    public static void main(String[] args) {

        System.out.println("searchNumber = " + searchNumber);
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                System.out.println("index = " + i);
            } else {
//                generateArray();
            }
        }
    }

//    private static int[] generateArray() {
//
//    }
}
