package w3resources_java_exercises.basicpart1;

/**
 * 96. Write a Java program to check if there is a 10 in a given array of integers
 * with a 20 somewhere later in the array.
 */
public class Ex96 {
    public static void main(String[] args) {
        Integer[] inputNumbers = {2,3,10,1,24,20,57,20,11,13,33};
        boolean is10 = false;
        boolean is20 = false;
        for (int number : inputNumbers) {
            if (number == 10) {
                is10 = true;
            }
            if (is10 == true && number == 20) {
                is20 = true;
            }
        }
        System.out.println(is10 && is20);
    }
}
