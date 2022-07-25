package section7_testing_code;

public class StringTuner {
    public String uppercaseUneven(String input) {

        //String output = null;
        //char[] charArray = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int index = 0; index < input.length(); index++) {
            char letter = input.charAt(index);
            if (String.valueOf(letter).equals("[a-zA-Z]")){
                return "Could not parse String, only chars from Aa-Zz are allowed!";
            } else if (index %2 != 0) {
                builder.append(Character.toString(letter).toUpperCase());
            } else {
               builder.append(input.charAt(index));
           }
        }
        return builder.toString();
    }
}
