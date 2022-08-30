package w3resources_java_exercises.basicpart1;

/**
 * 101. Write a Java program to check if the number of 10 is greater than number to 20 in a given array of integers.
 */
public class Ex101 {
    public static void main(String[] args) {
        Integer[] inputNumbers1 = {2,3,10,20,20,21,102,0,20,21,10};
        int tenCounter = 0;
        int twentyCounter = 0;
        for (int number : inputNumbers1) {
            switch (number) {
                case 10:
                    tenCounter++;
                    break;
                case 20:
                    twentyCounter++;
                    break;
            }
        }
        System.out.println("Tens: " + tenCounter + ", Twenties: " +twentyCounter);
        System.out.println(tenCounter < twentyCounter);
    }
}
