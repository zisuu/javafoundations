package section3_working_with_text.People;

public class Contains {
    public static void main(String[] args) {
        String myText = "Four score and seven years ago";
        System.out.println(myText.contains("seven")); // true
        System.out.println(myText.contains("sevenz")); // false
    }
}
