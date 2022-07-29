package section8_more_oop.exercises;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 2.0 Write code to print the following using only an Enum & loop without using any conditionals
 * (if/else/switch/etc.)
 * We eat pot roast on Sunday
 * We eat spaghetti on Monday
 * We eat tacos on Tuesday
 * We eat chicken on Wednesday
 * We eat meatloaf on Thursday
 * We eat hamburgers on Friday
 * We eat pizza on Saturday
 * 2.1 Do it again but capitalize the meal names too. “pot roast” should become “Pot Roast”.
 * (No solution provided because you’ve done this before in earlier exercise - but try to do
 * it without looking at previous work - for practice)
 */
public class Ex2 {

    public static void main(String[] args) {

        // 2.0
        for (DaysAndMeal day : DaysAndMeal.values()) {
            StringBuilder builder = new StringBuilder();
            System.out.printf("We eat %s on %s%n", day.getMeal(), capitalize(day.name()));
        }

    }
    private static String capitalize(String day) {
        String lowercaseDay = day.toLowerCase();
        return lowercaseDay.substring(0,1).toUpperCase() + lowercaseDay.substring(1);
    }
}
