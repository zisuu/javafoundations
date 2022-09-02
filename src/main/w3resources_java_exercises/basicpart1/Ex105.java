package w3resources_java_exercises.basicpart1;

/**
 * 105. Write a Java program to check if a group of numbers (l) at the start and end of a given array are same.
 */
public class Ex105 {
    public static void main(String[] args) {
        Integer[] myNumbers1 = {3,3,8,21,0};
        Integer[] myNumbers2 = {3,3,5,22,0};

        int groupOfNumbers = 2;
        int checkStartEqual = 1;
        int checkEndEqual = 1;
        for (int i = 0; i < groupOfNumbers; i++) {
            checkStartEqual = myNumbers1[i].compareTo(myNumbers2[i]);
            checkEndEqual = myNumbers1[myNumbers1.length-(i+1)].compareTo(myNumbers2[myNumbers1.length-(i+1)]);
        }

        if (checkStartEqual == 0 && checkEndEqual == 0) {
            System.out.println(true);;
        } else {
            System.out.println(false);
        }
    }
}
