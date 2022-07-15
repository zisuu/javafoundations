package section4_regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args) {
        String text = "AbracadabraAgracadagra";



        String regex = "\\w+([bg]ra)\\w+([bg]ra)";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(text);

        mat.find();
        System.out.println(mat.group(1));
        System.out.println(mat.group(2));
        System.out.println(mat.group(3));
        System.out.println(mat.group(4));

    }
}
