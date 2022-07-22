package section3_working_with_text;

public class Concat {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";
        System.out.println(text1 + " " + text2); // inefficient for memory usage

        System.out.println(text1.concat(text2)); // ok for a few Strings

        String finalString = new StringBuilder(text1.length()  + text2.length() +1)
                .append(text1)
                .append(" ")
                .append(text2)
                .toString(); // most efficient and flexible way if you need to combine a lot of Strings
        System.out.println(finalString);

        String otherFinalString = new StringBuffer() // does the same things as StringBuilder, but it is older and should not be used, as long as you dont need Thread-saifty
                .append(text1)
                .append(" ")
                .append(text2)
                .toString();
        System.out.println(otherFinalString);

        System.out.format("%s %s\n", text1, text2); // most simple way if you have a few strings
        String oneMoreFinalString = String.format("%s %s", text1, text2);
        System.out.println(oneMoreFinalString);
    }
}
