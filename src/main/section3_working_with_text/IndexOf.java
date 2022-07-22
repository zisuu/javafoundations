package section3_working_with_text;

public class IndexOf {
    public static void main(String[] args) {
        String myText = "ABCDEFGABCDEFG";

        System.out.println(myText.indexOf("A"));
        System.out.println(myText.indexOf(65)); // if you have a char which is hard to type you can use the unicode: unicode-table.com
        System.out.println(myText.indexOf(122)); // -1 means no match
        System.out.println(myText.lastIndexOf("A"));
        System.out.println(myText.indexOf("A", 2));

        String phoneNumber = "(234) 333-5551"; // extract these three parts in variables
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);
        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);

    }

    public static String parseAreaCode(String phoneNumber){
        int indexStart = phoneNumber.indexOf("(");
        int indexEnd = phoneNumber.indexOf(")");
        return phoneNumber.substring(indexStart + 1, indexEnd);
    }

    public static String parseExchange(String phoneNumber){
        int indexStart = phoneNumber.indexOf(" ");
        int indexEnd = phoneNumber.indexOf("-");
        return phoneNumber.substring(indexStart + 1, indexEnd);
    }

    public static String parseLineNumber(String phoneNumber){
        // option 1 return phoneNumber.substring(10,13);
        // option 2
        int indexEnd = phoneNumber.indexOf("-");
        return phoneNumber.substring(indexEnd + 1);
    }
}

