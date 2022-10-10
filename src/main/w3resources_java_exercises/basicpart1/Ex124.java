package w3resources_java_exercises.basicpart1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 124. Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.
 * Example:
 * [1, 2, 4, 5, 6] 5(searchNumber) -> 3(index)
 * [1, 2, 4, 5, 6] 0(searchNumber) -> 0(index)
 *  0, 1, 2, 3, 4
 * [1, 2, 4, 5, 6] 7(searchNumber) -> 5(index)
 */
public class Ex124 {
    private static Integer[] numbers = {1, 2, 4, 5, 6};
    private static int searchNumber = 0;

    public static void main(String[] args) {
        System.out.println("searchNumber = " + searchNumber);
        System.out.println("index = " + getIndexOf(searchNumber));
    }

    private static int getIndexOf(int searchNumber) {
        int returnIndex = 0;
        for (int i=0; i < numbers.length; i++) {
            if (numbers[i] == searchNumber) {
                returnIndex = i;
            } else {
                returnIndex = generateArrayToGetIndex();
            }
        }
        return returnIndex;
    }

    private static Integer[] generateArrayToGetIndex() {
        ArrayList<Integer> numberList = new ArrayList<Integer> (Arrays.asList(numbers));
        if (searchNumber < numberList.get(0)) {
            numberList.add(0, 0);
        } else if (searchNumber > numberList.get(numberList.size()-1)) {
            int index = 1;
            for (int i = numbers[numbers.length]; i < searchNumber; i++) {
                numberList.add(numbers.length + index, i);
            }
        }
        return (Integer[]) numberList.toArray();
    }
}
