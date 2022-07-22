package section3_working_with_text.exercises;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().strip(); // important part here
        System.out.printf("'%s'%n", userInput);
    }
}
