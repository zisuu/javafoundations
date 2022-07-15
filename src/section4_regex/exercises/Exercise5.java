package section4_regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise5 {
    public static void main(String[] args) {
        String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+";
        System.out.println("first.last@domain.com".matches(regex)); // true
        System.out.println("first.last@sub.domain.com".matches(regex)); // true
        System.out.println("first.last@subsub.sub.domain.com".matches(regex)); // true
        System.out.println("first@subsub.sub.domain.com".matches(regex)); // true
    }
}
