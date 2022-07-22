package section6_control_flow.exercises;

import java.util.Random;

/**
 * Write a method in 4 lines of code (not including method name/signature & curly braces) that
 * outputs the days of the week, one per line, using a regular ‘for-loop’ and an array.
 * 1. Do it again using the enhanced ‘for-loop’.
 * 2. Do it again but make every other output line fully capitalized.
 * Sunday
 * MONDAY
 * Tuesday
 * WEDNESDAY
 * etc…
 *
 * (hint) 3. Do it again but use only 4 lines of code (not including method and curly braces of
 * method.
 */
public class Ex1 {

    public static void main(String[] args) {
        // 1.0
        String[] days1 = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (int i = 0; i < days1.length; i++){
            System.out.println(days1[i]);
        }
        // 1.1
        String[] days2 = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (String day2 : days2){
            System.out.println(day2);
        }
        // 1.2
        String[] days3 = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (int i = 0; i < days1.length; i++){
            if (i % 2 == 0) {
                System.out.println(days1[i]);
            } else{
                System.out.println(days1[i].toUpperCase());
            }
        }
        // 1.3
        String[] days4 = {"mo", "di", "mi", "do", "fr", "sa", "so"};
        for (int i = 0; i < days1.length; i++){
            String day = (i % 2 == 0) ? days1[i] : days1[i].toUpperCase();
            System.out.println(day);
        }
    }


}
