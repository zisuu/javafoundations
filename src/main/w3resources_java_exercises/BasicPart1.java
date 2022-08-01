package w3resources_java_exercises;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicPart1 {

    public static void main(String[] args) {
        /**
         * 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line. Go to the editor
         * Expected Output :
         * Hello
         * Alexandra Abramov
         */
        System.out.println("Hello\nAlexandra Abramov");

        /**
         * 2. Write a Java program to print the sum of two numbers. Go to the editor
         * Test Data:
         * 74 + 36
         * Expected Output :
         * 110
         */
        System.out.println(74 + 36);

        /**
         * 9. Write a Java program to compute the specified expressions and print the output. Go to the editor
         * Test Data:
         * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
         * Expected Output
         * 2.138888888888889
         */
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

        /**
         * 10. Write a Java program to compute a specified formula. Go to the editor
         * Specified Formula :
         * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
         * Expected Output
         * 2.9760461760461765
         */
        System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));

        /**
         * 11. Write a Java program to print the area and perimeter of a circle. Go to the editor
         * Test Data:
         * Radius = 7.5
         * Expected Output
         * Perimeter is = 47.12388980384689
         * Area is = 176.71458676442586
         */
        // C = 2πr
        System.out.printf("Perimeter is = %s%n", 2 * Math.PI * 7.5);
        // A = πr2
        System.out.printf("Area is = %s%n", Math.PI * Math.pow(7.5,2));

        /**
         * 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
         */
        int num1 = 10;
        int num2 = 45;
        int num3 = 77;
        System.out.printf("Avg of Nums is: %d%n", ((num1 + num2 + num3) /3) );

        /**
         * 15. Write a Java program to swap two variables. Go to the editor
         */
        String var1 = "var1";
        String var2 = "var2";
        String temp = var1;
        var1 = var2;
        var2 = temp;

        /**
         * 31. Write a Java program to check whether Java is installed on your computer. Go to the editor
         * Expected Output
         *
         * Java Version: 1.8.0_71
         * Java Runtime Version: 1.8.0_71-b15
         * Java Home: /opt/jdk/jdk1.8.0_71/jre
         * Java Vendor: Oracle Corporation
         * Java Vendor URL: http://Java.oracle.com/
         * Java Class Path: .
         */
        System.out.println("\nJava Version: "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home: "+System.getProperty("java.home"));
        System.out.println("Java Vendor: "+System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");

        /**
         * 32. Write a Java program to compare two numbers. Go to the editor
         * Input Data:
         * Input first integer: 25
         * Input second integer: 39
         * Expected Output
         *
         * 25 != 39
         * 25 < 39
         * 25 <= 39
         */
        int first = 25;
        int second = 39;
        if (first != second) {
            System.out.println(first + " != " + second);
        };
        if (first < second) {
            System.out.println(first + " < " + second);
        };
        if (first <= second) {
            System.out.println(first + " <= " + second);
        };

        /**
         * 33. Write a Java program and compute the sum of the digits of an integer. Go to the editor
         * Input Data:
         * Input an integer: 25
         * Expected Output
         *
         * The sum of the digits is: 7
         */

        int a33 = 25;
        int sum = 0;
        while (a33 > 0){
            sum += a33 % 10;
            a33 /= 10;
        }
        System.out.printf("The sum of the digits is: %d%n", sum);

        /**
         * 37. Write a Java program to reverse a string. Go to the editor
         * Input Data:
         * Input a string: The quick brown fox
         * Expected Output
         *
         * Reverse string: xof nworb kciuq ehT
         */
        String input37 = "The quick brown fox";
        StringBuilder builder = new StringBuilder();
        for (int i = input37.length()-1; i >= 0 ; i--){
            builder.append(input37.charAt(i));
        }
        System.out.println(builder);

        /**
         *38. Write a Java program to count the letters, spaces, numbers and other characters of an input string.
         *  Expected Output
         *
         * The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
         * letter: 23
         * space: 9
         * number: 10
         * other: 6
         */
        String input38 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < input38.length() ; i++){
            if (Character.isLetter(input38.charAt(i))){
                letter++;
            } else if (Character.isSpaceChar(input38.charAt(i))){
                space++;
            } else if (Character.isDigit(input38.charAt(i))){
                number++;
            } else {
                other++;
            }
        }
        System.out.printf("letter: %d%n", letter);
        System.out.printf("space: %d%n", space);
        System.out.printf("number: %d%n", number);
        System.out.printf("other: %d%n", other);

        /**
         * 41. Write a Java program to print the ascii value of a given character. Go to the editor
         * Expected Output
         *
         * The ASCII value of Z is :90
         */
        int temp2 = 'Z';
        System.out.println("The ASCII value of Z is :" + temp2);

        /**
         * 42. Write a Java program to input and display your password. Go to the editor
         * Expected Output
         *
         * Input your Password:
         * Your password was: abc@123
         */

        //char[] input = System.console().readPassword("Input your Password: ");
        //System.out.printf("Your password was: %s%n", String.valueOf(input));

        /**
         * 44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Go to the editor
         * Sample Output:
         *
         * Input number: 5
         * 5 + 55  + 555
         */
//        Console cons;
//        if ((cons = System.console()) != null) {
//            int number44 = 0;
//            try {
//                number44 = Integer.parseInt(cons.readLine("Input number: "));
//                System.out.printf("%d + %d%d + %d%d%d%n", number44,number44,number44,number44,number44,number44);
//            } catch (NumberFormatException e) {
//                throw new RuntimeException(e);
//            }
//        } else {
//            throw new RuntimeException("You need to enter a number");
//        }
        /**
         * 45. Write a Java program to find the size of a specified file.
         * Sample Output:
         *
         * /home/students/abc.txt  : 0 bytes
         * /home/students/test.txt : 0 bytes
         */
        try {
            // size in bytes
            String filepath = "/Users/Dave/IdeaProjects/javafoundations/src/main/w3resources_java_exercises/BasicPart1.java";
            Path path = Paths.get(filepath);
            long bytes = Files.size(path);
            System.out.printf("%s : %d bytes %n", filepath, bytes);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
