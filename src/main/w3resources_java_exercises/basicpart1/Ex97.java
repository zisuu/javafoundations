package w3resources_java_exercises.basicpart1;

/**
 * 97. Write a Java program to check if an array of integers contains a specified number next
 * to each other or there are two same specified numbers separated by one element.
 */
public class Ex97 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,10,10,24,20,10,21,14,13,10};
        int specifiedNumber = 10;
        boolean specNumNext = false;
        boolean specNumNextPlusOne = false;
        for (int i = 0; i < inputNumbers.length -1; i++) {
            if (inputNumbers[i] == specifiedNumber) {
                if (inputNumbers[i] == inputNumbers[i+1]){
                    specNumNext = true;
                }
                if (i < inputNumbers.length -2 && inputNumbers[i] == inputNumbers[i+2]) {
                    specNumNextPlusOne = true;
                }
            }
        }
        System.out.println(!specNumNext | !specNumNextPlusOne);
    }
}
