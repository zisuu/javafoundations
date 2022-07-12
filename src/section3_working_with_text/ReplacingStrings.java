package section3_working_with_text;

public class ReplacingStrings {
    public static void main(String[] args) {
        String myText = "here's firf my awesome firf text";
        System.out.println(myText.replace("firf", "nice"));
        System.out.println(myText.replace('e', 'Z'));
    }
}
