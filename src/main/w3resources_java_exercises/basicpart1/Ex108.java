package w3resources_java_exercises.basicpart1;

/**
 * 108. Write a Java program to add all the digits of a given positive integer until the result has a single digit.
 */
public class Ex108 {
    public static void main(String[] args) {
        int number = 25;
        System.out.printf("The single digit number is: %d", (number == 0 ? 0 : (number %9 == 0 ? 9 : number %9)));
    }
}
