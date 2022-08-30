package w3resources_java_exercises.basicpart1;

/**
 * 99. Write a Java program to check if a specified number appears in every pair of adjacent element of a given array of integers.
 */
public class Ex99 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,10,20,20,21,10,21,14,13,20};
        int specifiedNumber = 20;
        boolean pairOfAdjacentNumber = false;
        for (int i = 0; i < inputNumbers.length -2; i++) {
            if (inputNumbers[i+1] == specifiedNumber) {
                if (inputNumbers[i+1] == inputNumbers[i+2]){
                    pairOfAdjacentNumber = true;
                }
            }
        }
        System.out.println(pairOfAdjacentNumber);
    }
}
