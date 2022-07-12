package section3_working_with_text.exercises;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        String myString = "   alphabet";
        String mainString = myString.substring(0,(myString.length() -1));
        String endString = myString.substring((myString.length() -1)).toUpperCase();
        String finalString = mainString.concat(endString).strip();
        System.out.printf("'%s'%n", finalString);
    }
}
