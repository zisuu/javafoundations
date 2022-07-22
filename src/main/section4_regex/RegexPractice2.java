package section4_regex;

public class RegexPractice2 {
    public static void main(String[] args) {
        System.out.println("doggy".matches(".....")); // . represents any char
        System.out.println("doggy".matches(".*")); // . represents any char
        System.out.println("doggy".matches(".+")); // . represents any char
        // System.out.println("doggy".matches("[^a]")); // ^ in eickigen Klammern steht für NOT
        System.out.println("doggy".matches("^.....")); // ^ ohne Klammern steht für Zeilenanfang
        System.out.println("doggy".matches(".....$")); // $ steht für Zeilenende
        System.out.println("doggy".matches("\\b.....")); // boundry char does not macht a space
        System.out.println("dog".matches("\\w\\w\\w")); // any words
        System.out.println("---".matches("\\W\\W\\W")); // anything other than words
        System.out.println("123".matches("\\d\\d\\d")); // any digits
        System.out.println("---".matches("\\D\\D\\D")); // anything other than digits
        System.out.println(" ".matches("\\s")); // any space
        System.out.println("a".matches("\\S")); // anything other than space
    }
}
