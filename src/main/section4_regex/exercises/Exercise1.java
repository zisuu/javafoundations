package section4_regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise1 {
    public static void main(String[] args) {
        String regex = "[DbLs]t?ark";
        System.out.println("Dark".matches(regex)); // true
        System.out.println("bark".matches(regex)); // true
        System.out.println("Lark".matches(regex)); // true
        System.out.println("stark".matches(regex)); // true
    }
}
