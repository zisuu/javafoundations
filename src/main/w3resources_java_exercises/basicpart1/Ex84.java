package w3resources_java_exercises.basicpart1;

/**
 * 84. Write a Java program to take the last three characters from a given string and add the three
 * characters at both the front and back of the string. String length must be greater than three
 * and more. Go to the editor
 * Test data: "Python" will be "honPythonhon"
 * Sample Output:
 *
 * honPythonhon
 */
public class Ex84 {
    public static void main(String[] args) {
        String input = "Python";
        if (input.length() > 3) {
            String threeChars = input.substring(input.length()-3);
            System.out.println(threeChars.concat(input).concat(threeChars));
        }
    }
}
