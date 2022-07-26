package w3resources_java_exercises;

import java.sql.SQLOutput;

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
    }
}
