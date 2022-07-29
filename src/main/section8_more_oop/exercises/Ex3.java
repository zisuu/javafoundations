package section8_more_oop.exercises;

import java.util.Locale;

/**
 * Write a method that takes the following input String (in bold) and returns the following
 * output String using an Enum like (print the output):
 * getMealsForDays(“friday, thursday, monday, saturday, tuesday”)
 * Output: hamburgers, meatloaf, spaghetti, etc…
 */
public class Ex3 {

    public static void main(String[] args) {
        String meals = getMealsForDays("friday, thursday, monday, saturday, tuesday");
        System.out.println(meals);
    }

    private static String getMealsForDays(String daysStr) {
        String days[] = daysStr.split(",");
        StringBuilder sb = new StringBuilder();
        for (String day : days) {
            sb.append(DaysAndMeal.valueOf(day.strip().toUpperCase()).getMeal());
            sb.append(", ");
        }
        int lastCommaIndex = sb.length() - 2;
        sb.delete(lastCommaIndex, lastCommaIndex + 1);
        return sb.toString();
    }

}
