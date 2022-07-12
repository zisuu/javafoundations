package section3_working_with_text.People;

public class ContentEquals {
    public static void main(String[] args) {
        String fristText = "Apple";
        String secondText = "Apple";

        System.out.println(fristText.contentEquals(secondText)); // true
        System.out.println(fristText.equals(secondText)); // true

        StringBuffer thirdText = new StringBuffer("Apple");
        System.out.println(fristText.contentEquals(thirdText)); // true
        System.out.println(fristText.equals(thirdText)); // false

    }
}
