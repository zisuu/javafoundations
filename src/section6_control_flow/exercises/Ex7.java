package section6_control_flow.exercises;

public class Ex7 {

    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int sum = 0;
        for (String day : days) {
            sum += day.length();
        }
        System.out.println(sum);
    }
}
