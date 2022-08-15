package w3resources_java_exercises.basicpart1;

import javax.swing.text.DateFormatter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
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

        /**
         * 46. Write a Java program to display the system time. Go to the editor
         * Sample Output:
         *
         * Current Date time: Fri Jun 16 14:17:40 IST 2017
         */
        String pattern = "EEE MMM dd HH:mm:ss z yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println("Current Date time: " +date);

        /**
         * 47. Write a Java program to display the current date time in specific format. Go to the editor
         * Sample Output:
         *
         * Now: 2017/06/16 08:52:03.066
         */
        String pattern47 = "yyyy/MM/dd HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat47 = new SimpleDateFormat(pattern47);

        String date47 = simpleDateFormat47.format(new Date());
        System.out.println("Current Date time: " +date47);

        /**
         * 48. Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
         * Sample Output:
         *
         * 1
         * 3
         * 5
         * 7
         * 9
         * 11
         * ....
         *
         * 91
         * 93
         * 95
         * 97
         * 99
         */
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        /**
         * 49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
         * Sample Output:
         *
         * Input a number: 20
         * 1
         */

//        String input49 = System.console().readLine("Input a number: ");
//        try {
//            int number49 = Integer.parseInt(input49);
//            int result49 = number49 % 2 == 0 ? 1 : 0;
//                System.out.println(result49);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }

        /**
         * 50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both. Go to the editor
         * Sample Output:
         *
         * Divided by 3:
         * 3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
         * , 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,
         *
         * Divided by 5:
         * 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
         * 95,
         *
         * Divided by 3 & 5:
         * 15, 30, 45, 60, 75, 90,
         */
        StringBuilder sbDividedByThree = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sbDividedByThree.append(i + ", ");
            }
        }
        System.out.println("Divided by 3: " + sbDividedByThree.toString());

        StringBuilder sbDividedByFife = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                sbDividedByFife.append(i + ", ");
            }
        }
        System.out.println("Divided by 5: " + sbDividedByFife.toString());

        StringBuilder sbDividedByFifeAndThree = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                sbDividedByFifeAndThree.append(i + ", ");
            }
        }
        System.out.println("Divided by 3 and 5 : " +sbDividedByFifeAndThree);

        /**
         * 52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer. Go to the editor
         * Sample Output:
         *
         * Input the first number : 5
         * Input the second number: 10
         * Input the third number : 15
         * The result is: true
         */
//        String input52_1 = System.console().readLine("Input the first number: ");
//        String input52_2 = System.console().readLine("Input the second number: ");
//        String input52_3 = System.console().readLine("Input the third number: ");
//        try {
//            int number52_1 = Integer.parseInt(input52_1);
//            int number52_2 = Integer.parseInt(input52_2);
//            int number52_3 = Integer.parseInt(input52_3);
//            boolean result = false;
//            if (number52_1 + number52_2 == number52_3) {
//                result = true;
//            }
//            System.out.println("The result is: " + result);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }

        /**
         * 53. Write a Java program that accepts three integers from the user and return true if the second number is
         * greater than first number and third number is greater than second number.
         * If "abc" is true second number does not need to be greater than first number. Go to the editor
         * Sample Output:
         *
         * Input the first number : 5
         * Input the second number: 10
         * Input the third number : 15
         * The result is: true
         */
//        String input53_1 = System.console().readLine("Input the first number: ");
//        String input53_2 = System.console().readLine("Input the second number: ");
//        String input53_3 = System.console().readLine("Input the third number: ");
//        try {
//            int number53_1 = Integer.parseInt(input53_1);
//            int number53_2 = Integer.parseInt(input53_2);
//            int number53_3 = Integer.parseInt(input53_3);
//            boolean result = false;
//            if (number53_1 < number53_2 && number53_2 < number53_3) {
//                result = true;
//            }
//            System.out.println("The result is: " + result);
//        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
//        }

        /**
         * 54. Write a Java program that accepts three integers from the user and return true if two or
         * more of them (integers ) have the same rightmost digit. The integers are non-negative. Go to the editor
         * Sample Output:
         *
         * Input the first number : 5
         * Input the second number: 10
         * Input the third number : 15
         * The result is: true
         */
//        Scanner in54 = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x54 = in54.nextInt();
//        System.out.print("Input the second number: ");
//        int y54 = in54.nextInt();
//        System.out.print("Input the third number : ");
//        int z54 = in54.nextInt();
//        System.out.print("The result is: " + test_last_digit54(x54, y54, z54,true));
//        System.out.print("\n");

        /**
         * 55. Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
         * Sample Output:
         *
         * Input seconds: 86399
         * 23:59:59
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input seconds: ");
//        int seconds = in.nextInt();
//        int p1 = seconds % 60;
//        int p2 = seconds / 60;
//        int p3 = p2 % 60;
//        p2 = p2 / 60;
//        System.out.print( p2 + ":" + p3 + ":" + p1);
//        System.out.print("\n");

        /**
         * 56. Write a Java program to find the number of values in a given range divisible by a given value.
         * For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are
         * divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
         * Sample Output:
         *
         * 5
         */
        int x = 5;
        int y = 20;
        int p = 3;
        for (int i = x; i < y; i++) {
            if (i % p == 0) {
                System.out.println(i);
            }
        }

        /**
         * 58. Write a Java program to capitalize the first letter of each word in a sentence. Go to the editor
         * Sample Output:
         *
         * Input a Sentence: the quick brown fox jumps over the lazy dog.
         * The Quick Brown Fox Jumps Over The Lazy Dog.
         */
        String word58 = "the quick brown fox jumps over the lazy dog.";
        String[] words58 = word58.split(" ");
        StringBuilder sb58 = new StringBuilder();

        for (int i = 0; i < words58.length; i++) {
            sb58.append(String.valueOf(words58[i].charAt(0)).toUpperCase());
            sb58.append(words58[i].substring(1));
            if (i != words58.length -1){
                sb58.append(" ");
            }
        }
        System.out.println(sb58.toString());

        /**
         * 59. Write a Java program to convert a given string into lowercase. Go to the editor
         * Sample Output:
         *
         * Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
         * the quick brown fox jumps over the lazy dog.
         */
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input Text: ");
//        String input59 = in.nextLine();
//        System.out.println(input59.toLowerCase());
        /**
         * 60. Write a Java program to find the penultimate (next to last) word of a sentence. Go to the editor
         * Sample Output:
         *
         * Input a String: The quick brown fox jumps over the lazy dog.
         * Penultimate word: lazy
         */
//        Scanner in60 = new Scanner(System.in);
//        System.out.print("Input Text: ");
//        String input60 = in60.nextLine();
//        String[] words60 = input60.split(" ");
//        System.out.println(words60[words60.length -2]);

        /**
         * 61. Write a Java program to reverse a word. Go to the editor
         * Sample Output:
         *
         * Input a word: dsaf
         * Reverse word: fasd
         */
//        Scanner in61 = new Scanner(System.in);
//        System.out.print("Input Text: ");
//        String input61 = in61.nextLine();
//        String result61 = "";
//        for (int i = input61.length(); i > 0; i--) {
//            result61 += String.valueOf(input61.charAt(i-1));
//        }
//        System.out.println(result61);

        /**
         * 62. Write a Java program that accepts three integer values and return true if one of them is 20 or more and less than the substractions of others. Go to the editor
         * Sample Output:
         *
         * Input the first number : 15
         * Input the second number: 20
         * Input the third number : 25
         * false
         */
//        Scanner in62 = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x62 = in62.nextInt();
//        System.out.print("Input the second number: ");
//        int y62 = in62.nextInt();
//        System.out.print("Input the third number : ");
//        int z62 = in62.nextInt();
//        System.out.print((Math.abs(x62 - y62) >= 20 || Math.abs(y62 - z62) >= 20 || Math.abs(z62 - x62) >= 20));

        /**
         * 63. Write a Java program that accepts two integer values from the user and return the larger values.
         * However if the two values are the same, return 0 and return the smaller value if the two values have
         * the same remainder when divided by 6.
         * Sample Output:
         *
         * Input the first number : 12
         * Input the second number: 13
         * Result: 13
         */
//        Scanner in63 = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x63 = in63.nextInt();
//        System.out.print("Input the second number: ");
//        int y63 = in63.nextInt();
//        int result = Math.max(x63, y63);
//        if (x63 == y63) {
//            result = 0;
//        } else if (x63 % 6 == y63 % 6) {
//            result = Math.min(x63, y63);
//        }
//        System.out.println(result);

        /**
         * 64. Write a Java program that accepts two integer values between 25 to 75 and return true if there
         * is a common digit in both numbers. Go to the editor
         * Sample Output:
         *
         * Input the first number : 35
         * Input the second number: 45
         * Result: true
         */
//        Scanner in64 = new Scanner(System.in);
//        System.out.print("Input the first number (between 25 to 75) : ");
//        int x64 = in64.nextInt();
//        System.out.print("Input the second number (between 25 to 75): ");
//        int y64 = in64.nextInt();
//        int result;
//        if (x64 >= 25 && x64 <= 75 && y64 >= 25 && y64 <= 75) {
//            int q64 = x64 % 10;
//            int p64 = y64 % 10;
//            x64 /= 10;
//            y64 /= 10;
//            System.out.println((p64 == q64 || p64 == y64 || x64 == q64 || x64 == y64));
//        } else {
//            System.out.println("must be a valid number between 25 to 75");
//        }

        /**
         * 65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus
         * operator. Go to the editor
         * Sample Output:
         *
         * Input the first number : 19
         * Input the second number: 7
         * 5
         */
//        Scanner in65 = new Scanner(System.in);
//        System.out.print("Input the first number : ");
//        int x65 = in65.nextInt();
//        System.out.print("Input the second number : ");
//        int y65 = in65.nextInt();
//        System.out.println(x65 - (x65 / y65) * y65);

        /**
         * 66. Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
         * Sample Output:
         *
         * Sum of the first 100 prime numbers: 24133
         */
        /*
         * In einem boolean[] wird festgehalten, welche Zahlen teilbar sind.
         * Dies ist einfacher, als festzuhalten, welche Zahlen prim sind, da
         * boolean-Werte per Default false sind.
         */
        boolean[] divisible = new boolean[100 + 1];
        int primeNumberCounter = 0;
        for (int i66 = 2; i66 < 100; i66++) {
            if (!divisible[i66]) {
                /*
                 * Wenn i nicht teilbar ist, ist es prim. In dem Fall werden alle
                 * Vielfachen von i als teilbar markiert.
                 */
                primeNumberCounter++;
                for (int j = 2 * i66; j < divisible.length; j += i66) {
                    divisible[j] = true;
                }
            }
        }
        // Nun ist bekannt, wie viele Primzahlen es gibt
        int[] ergebnis = new int[primeNumberCounter];
        int ergebnisIndex = 0;
        // alle nicht teilbaren Zahlen werden in das Ergebnis-Array eingetragen
        for (int i66 = 2; i66 < divisible.length; i66++) {
            if (!divisible[i66]) {
                ergebnis[ergebnisIndex++] = i66;
            }
        }
        for (int i66 = 0; i66 < ergebnis.length; i66++) {
            System.out.println(ergebnis[i66]);
        }
    }
//    public static boolean test_last_digit54(int p54, int q54, int r54, boolean xyz)
//    {
//        return (p54 % 10 == q54 % 10) || (p54 % 10 == r54 % 10) || (q54 % 10 == r54 % 10);
//    }
}
