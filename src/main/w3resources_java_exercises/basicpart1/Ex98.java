package w3resources_java_exercises.basicpart1;

/**
 * 98. Write a Java program to check if the value 20 appears three times and no 20's are next to each other
 * in a given array of integers.
 */
public class Ex98 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,10,20,20,21,10,21,14,13,20};
        int twentyCounter = 0;
        boolean isTwentyThreeTimes = false;
        boolean twentyIsNextTwenty = false;
        for (int i = 0; i < inputNumbers.length -1; i++) {
            if (inputNumbers[i] == 20) {
                twentyCounter++;
                if (inputNumbers[i] == inputNumbers[i+1]){
                    twentyIsNextTwenty = true;
                }
            }
        }
        System.out.println(!twentyIsNextTwenty && twentyCounter == 2);
    }
}
