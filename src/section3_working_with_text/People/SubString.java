package section3_working_with_text.People;

public class SubString {
    public static void main(String[] args) {
        String myText = "apple";

        String myNewText = myText.substring(0);
        System.out.println(myNewText);

        String myNewText1 = myText.substring(1);
        System.out.println(myNewText1);

        String myNewText2 = myText.substring(0,1);
        System.out.println(myNewText2);

        String fristPart = myText.substring(0, 1);
        String secondPart = myText.substring(1);
        String myNewText3 = fristPart.toUpperCase().concat(secondPart);
        System.out.println(myNewText3);

        int capacity = myText.length();
        String finalString = new StringBuilder(capacity)
                .append(myText.substring(0, 1).toUpperCase())
                .append(myText.substring(1))
                .toString();
        System.out.println(finalString);
    }
}
