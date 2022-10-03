package w3resources_java_exercises.basicpart1;

import java.util.Arrays;

/**
 *  114. Write a Java program to given a string and an offset, rotate string by offset (rotate from left to right).
 */
public class Ex114 {
    public static void main(String[] args) {
        String myString = "Hello World";
        int offset = 2;
        String toLeft = myString.substring(0, offset);
        String toRight = myString.substring(offset);
//        System.out.println(toLeft);
//        System.out.println(toRight);
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(toRight).append(toLeft));

    }
}
