package w3resources_java_exercises.basicpart1;
import java.util.*;

public class Ex66 {
    public static void main(String[] args) {
        int sum = 1;
        int counter = 0;
        int number = 0;

        while (counter < 100) {
            number++;
            if (number % 2 != 0) {
                // check if the number is even
                if (is_Prime(number)) {
                    sum += number;
                }
            }
            counter++;
        }
        System.out.println("\nSum of the prime numbers till 100: "+sum);
    }

    public static boolean is_Prime(int number) {
        for (int i = 3; i * i <= number; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
