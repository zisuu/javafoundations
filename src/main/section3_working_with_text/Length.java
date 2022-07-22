package section3_working_with_text;

public class Length {
    public static void main(String[] args) {
        String myText = "for score and seven years ago";
        String secondText = "score";

        System.out.println(myText.length());
        char[] chars = myText.toCharArray();
        int index = 100;
        if (index < myText.length()){
            System.out.println(chars[index]);
        }

        StringBuilder builder = new StringBuilder(myText.length() + secondText.length())
                .append(myText)
                .append(secondText);
        System.out.println(builder.toString());
    }
}
