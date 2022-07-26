package section7_testing_code;

public class Exercise1 {
    public String uppercaseUneven(String input) {

        //String output = null;
        //char[] charArray = input.toCharArray();
        StringBuilder builder = new StringBuilder(input.length());
        for (int index = 0; index < input.length(); index++) {
            String curLetter = input.substring(index, index+1);
            if (index % 2 == 0) {
                builder.append(curLetter);
            } else {
                builder.append(curLetter.toUpperCase());
           }
        }
        return builder.toString();
    }
}
