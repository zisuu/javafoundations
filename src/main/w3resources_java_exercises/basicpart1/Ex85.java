package w3resources_java_exercises.basicpart1;

/**
 * 85. Write a Java program to check if a string starts with a specified word. Go to the editor
 * Sample Data: string1 = "Hello how are you?"
 * Sample Output:
 *
 * true
 */
public class Ex85 {
    public static void main(String[] args) {
        String string1 = "Hello how are you?";
        System.out.println(string1.matches("^Hello.*")); // Option 1
        System.out.println(string1.startsWith("Hello")); // Option 2
    }
}
