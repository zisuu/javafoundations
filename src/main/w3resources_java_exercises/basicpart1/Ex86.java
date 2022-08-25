package w3resources_java_exercises.basicpart1;

/**
 * 86. Write a Java program start with an integer n, divide n by 2 if n is even or multiply by 3
 * and add 1 if n is odd, repeat the process until n = 1.
 */
public class Ex86 {
    public static void main(String[] args) {
        int n = 46;
        while (n != 1){
            n = n %2 == 0 ? n/2 : (3*n+1)/2;
            System.out.println(n);
        }
    }
}
