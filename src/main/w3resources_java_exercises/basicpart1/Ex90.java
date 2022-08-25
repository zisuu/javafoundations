package w3resources_java_exercises.basicpart1;

/**
 * 90. Write a Java program to get the value of the environment variable PATH, TEMP, USERNAME
 */
public class Ex90 {
    public static void main(String[] args) {
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv("TEMP"));
        System.out.println(System.getenv("USERNAME"));
    }
}
