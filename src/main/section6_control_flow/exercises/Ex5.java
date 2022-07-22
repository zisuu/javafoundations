package section6_control_flow.exercises;

public class Ex5 {

    public static void main(String[] args) {

        String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (String day : days) {
            switch (day) {
                case "mo":
                    System.out.printf("We eat roast on %s%n", day);
                    break;
                case "di":
                    System.out.printf("We eat spaghetti on %s%n", day);
                    break;
                case "mi":
                    System.out.printf("We eat tacos on %s%n", day);
                    break;
                case "do":
                    System.out.printf("We eat chicken on %s%n", day);
                    break;
                case "fr":
                    System.out.printf("We eat meatloaf on %s%n", day);
                    break;
                case "sa":
                    System.out.printf("We eat hamburgers on %s%n", day);
                    break;
                case "so":
                    System.out.printf("We eat pizza on %s%n", day);
                    break;
            }
        }
    }
}
