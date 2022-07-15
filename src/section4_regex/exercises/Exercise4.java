package section4_regex.exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise4 {
    public static void main(String[] args) {
        String regex = """
        (?<strasse>.*?)\\s(?<nr>\\d+\\w?),\\s(?<plz>\\d{4})\\s(?<ort>\\w+)
        """;
        //String adresse = "Dorfmattweg 1a, 9000 Biel";
        //String adresse = "Mingerstrasse 12, 3030 Bern";
        //String adresse = "Eternitstrasse 3, 8870 Niederurnen";
        String adresse ="Rue de la Condémine 52, 1630 Bulle";

        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS); // careful: Pattern.COMMENTS ignores whitespaces
        Matcher mat = pat.matcher(adresse);

        if (mat.matches()){
            //System.out.format("entire String: %s\n", mat.group(0));
            System.out.format("Strasse: %s\n", mat.group("strasse"));
            System.out.format("Nr: %s\n", mat.group("nr"));
            System.out.format("Plz: %s\n", mat.group("plz"));
            System.out.format("Ort: %s\n", mat.group("ort"));
        }
    }
}
