package section3_working_with_text.People;

public class Strip {
    public static void main(String[] args) {
        String fristName = "  Jake   ";
        System.out.format("'%s'", fristName.strip());
        System.out.format("'%s'", fristName.stripLeading());
        System.out.format("'%s'", fristName.stripTrailing());
        System.out.format("'%s'", fristName.trim()); // should not be used, is not much aware of different encodings
        System.out.format("'%s'", strip(fristName));
    }

    public static String strip (String text){
        return text.replace(" ", "");
    }
}
