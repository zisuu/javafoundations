package section4_regex;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("car".matches("car")); // true
        System.out.println("Car".matches("[Cc]ar")); // true
        System.out.println("car".matches("[A-Ca-c]ar")); // true
        System.out.println("jar".matches("\\war")); // true
        System.out.println("5D_".matches("\\w\\w\\w")); // true
        System.out.println("523".matches("\\d\\d\\d")); // true
        System.out.println("523-231-4444".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d")); // true
        System.out.println("523-231-4444".matches("\\d{3}-\\d{3}-\\d{4}")); // true
        System.out.println("523-231.4444".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); // true
        System.out.println("523 231 4444".matches("\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}")); // true
        System.out.println("523 ..231  4444".matches("\\d{3}[-.\\s]+\\d{3}[-.\\s]+\\d{4}")); // true
        System.out.println("523231 .4444".matches("\\d{3}[-.\\s]*\\d{3}[-.\\s]*\\d{4}")); // true
        System.out.println("523231-4444".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{4}")); // true
        System.out.println("523231-444".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,4}")); // true
        System.out.println("523231-423423444".matches("\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d{3,}")); // true
    }
}
