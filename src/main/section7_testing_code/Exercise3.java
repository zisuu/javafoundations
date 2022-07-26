package section7_testing_code;

public class Exercise3 {

    public static String spoonerize(String input) {
        String[] words = input.split(" ");
        String spoonLettersWordOne = words[0].substring(0,1);
        String staticLettersWordOne = words[0].substring(1);
        String spoonLettersWordTwo = words[1].substring(0,1);
        String staticLettersWordTwo = words[1].substring(1);
        StringBuilder builder = new StringBuilder()
                .append(spoonLettersWordTwo)
                .append(staticLettersWordOne)
                .append(" ")
                .append(spoonLettersWordOne)
                .append(staticLettersWordTwo);
        return builder.toString();
    }
}
