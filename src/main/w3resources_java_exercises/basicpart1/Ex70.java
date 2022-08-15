package w3resources_java_exercises.basicpart1;

/**
 * 70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings.
 * The strings must not have the same length.
 * Test Data: Str1 = Python
 * Str2 = Tutorial
 * Sample Output:
 *
 * PythonTutorialPython
 */
public class Ex70 {
    public static void main(String[] args) {
        String Str1 = "Python";
        String Str2 = "Tutorial";
        if (Str1.length() >= Str2.length()) {
            System.out.println(Str2.concat(Str1).concat(Str2));
        } else {
            System.out.println(Str1.concat(Str2).concat(Str1));
        }

    }
}
