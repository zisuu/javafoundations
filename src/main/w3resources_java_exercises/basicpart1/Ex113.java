package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 *  113. Write a Java program to merge two given sorted array of integers and create a new sorted array. Go to the editor
 * array1 = [1,2,3,4]
 * array2 = [2,5,7,8]
 * result = [1,2,2,3,4,5,7,8]
 */
public class Ex113 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {2,5,7,8};
        int sizeArray1 = array1.length;
        int sizeArray2 = array2.length;
        int[] result = new int[sizeArray1 + sizeArray2];
        System.arraycopy(array1, 0, result, 0, sizeArray1);
        System.arraycopy(array2, 0, result, sizeArray1, sizeArray2);
        System.out.printf("Merged but unsorted: %s%n", Arrays.toString(result));

        int[] temp = Arrays.copyOf(result,result.length);
        for (int numberSelector = 0; numberSelector < result.length; numberSelector++) {
            for (int index = 0; index < result.length -1; index++) {
                if (result[index] > result[index+1]) {
                    result[index] = result[index+1];
                    result[index+1] = temp[index];
                }
            }
        }
        System.out.printf("Merged and sorted: %s%n", Arrays.toString(result));
    }
}
