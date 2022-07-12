package section3_working_with_text.People;

public class BlankOrEmpty {
    public static void main(String[] args) {
        String myText = "";
        System.out.println(myText.isEmpty()); // true

        String myText2 = " ";
        System.out.println(myText2.isEmpty()); // false

        String myText3 = "";
        System.out.println(myText3.isBlank()); // true -> Preferred to check if user entered something

        String myText4 = " ";
        System.out.println(myText4.isBlank()); // true

        String myText5 = "a";
        System.out.println(myText5.isBlank()); // false
    }
}
