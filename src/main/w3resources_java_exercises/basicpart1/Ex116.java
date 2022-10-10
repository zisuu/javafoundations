package w3resources_java_exercises.basicpart1;

/**
 * 116. Write a Java program which iterates the integers from 1 to 100.
 * For multiples of three print "Fizz" instead of the number and print "Buzz"
 * for the multiples of five. When number is divided by both three and five, print "fizz buzz".
 */
public class Ex116 {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + " = fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " = Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " = Buzz");
            }
        }
    }
}