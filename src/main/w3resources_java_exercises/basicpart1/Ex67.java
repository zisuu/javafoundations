package w3resources_java_exercises.basicpart1;

import java.util.Scanner;

/**
 *     67. Write a Java program to insert a word in the middle of the another string. Go to the editor
 *     Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
 *     Sample Output:
 *
 *     Python Tutorial 3.0
 */
public class Ex67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your basic String : ");
        String basicString = in.nextLine();
        System.out.print("Input your insert String : ");
        String insertedString = in.nextLine();
        String basicStringPartOne = basicString.substring(0,getFirstSpace(basicString));
        String basicStringPartTwo = basicString.substring(getFirstSpace(basicString));
        StringBuilder sb = new StringBuilder();
        sb.append(basicStringPartOne).append(" ").append(insertedString).append(basicStringPartTwo);
        System.out.println(sb.toString());
    }

    private static int getFirstSpace(String input){
        return input.indexOf(" ");
    }
}
