package section6_control_flow.exercises;

public class Ex4 {

    public static void main(String[] args) {

        String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (String day : days){
            if ("mo".equals(day)) {
                System.out.printf("We eat roast on %s%n", day);
            } else if ("di".equals(day)) {
                System.out.printf("We eat spaghetti on %s%n", day);
            } else if ("mi".equals(day)) {
                System.out.printf("We eat tacos on %s%n", day);
            } else if ("do".equals(day)) {
                System.out.printf("We eat chicken on %s%n", day);
            } else if ("fr".equals(day)) {
                System.out.printf("We eat meatloaf on %s%n", day);
            } else if ("sa".equals(day)) {
                System.out.printf("We eat hamburgers on %s%n", day);
            } else if ("so".equals(day)) {
                System.out.printf("We eat pizza on %s%n", day);
            }
        }
    }
}
