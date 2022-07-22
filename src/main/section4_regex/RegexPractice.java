package section4_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        System.out.println("523 231 4234".matches("(\\d{3}[-.\\s]?){2}\\d{3,}")); // true


        String regex = """
        # this is my regex to parse the parts of a phone number
        (?:(?<countryCode>\\d{1,2})[-.\\s])? # gets countryCode
        (?:\\(?(?<areaCode>\\d{3})\\)?[-.\\s]?) # gets areaCode
        (?:(?<exchangeCode>\\d{3})[-.\\s]?) # gets exchangeCode
        (?<lineNumber>\\d{4}) # gets lineNumber
        """;
        String phoneNumber = "(523) 231-4234";

        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS); // careful: Pattern.COMMENTS ignores whitespaces
        Matcher mat = pat.matcher(phoneNumber);

        if (mat.matches()){
            //System.out.format("entire String: %s\n", mat.group(0));
            System.out.format("Country Code: %s\n", mat.group("countryCode"));
            System.out.format("Area Code: %s\n", mat.group("areaCode"));
            System.out.format("Exchange Code: %s\n", mat.group("exchangeCode"));
            System.out.format("Line number Code: %s\n", mat.group("lineNumber"));
        }
    }
}
