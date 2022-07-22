package section6_control_flow.exercises;

public class Ex6 {

    public static void main(String[] args) {

        String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (String day : days) {
            String meal = switch (day) {
                case "mo"->"roast";
                case "di"->"spaghetti";
                case "mi"->"tacos";
                case "do"->"chicken";
                case "fr"->"meat loaf";
                case "sa"->"ham burgers";
                case default->"pizza";
            };
            //System.out.printf("We eat %s on %s%n", capitalize(meal), day);
            System.out.printf("We eat %s on %s%n", multiCapitalize(meal), day);
        }
    }

    private static String capitalize(String meal){
        return meal.substring(0,1).toUpperCase().concat(meal.substring(1));
    }
    private static String multiCapitalize(String meal){
        String[] words = meal.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word: words){
            sb.append(capitalize(word)).append(" ");
        }
        return sb.toString().strip();
    }
}
