package section6_control_flow.exercises;

public class Ex2 {

    public static void main(String[] args) {

        // 1.0
        String[] days = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        int index1 = 0;
        while (index1 < days.length){
            System.out.println(days[index1++]);
        }

        // 1.2
        int index2 = 0;
        while (index2 < days.length){
            if (index2 % 2 == 0) {
                System.out.println(days[index2++]);
            } else{
                System.out.println(days[index2++].toUpperCase());index2++;
            }
        }

        // 1.3
        int index3 = 0;
        while (index3 < days.length){
           String day = (index3 % 2 == 0) ? days[index3++] : days[index3++].toUpperCase();
            System.out.println(day);
        }
    }
}
