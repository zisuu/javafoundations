package section8_more_oop.exercises;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * 1.0 Use an Enum to model the days of the week and print them using a loop.
 * 1.1 Print them with the first letter capitalized (without changing the Enum constants).
 * 1.2 Alternate between printing the first letter capitalized or whatever letter is approximately
 * in the middle of the word. For example: Sunday, monDay, Tuesday, wednEsday, etc.
 * 1.3 Print 10 randomly-chosen days of the week
 */
public class Ex1 {


    public static void main(String[] args) {
        Days[] days = Days.values();

        // 1.0
        for (Days day : days) {
            System.out.println(day.toString());
        }
        System.out.println("########################");

        // 1.1
        for (Days day : days) {
            StringBuilder builder = new StringBuilder();

            System.out.println(builder.append(day.toString().substring(0, 1)).append(day.toString().substring(1).toLowerCase()));
        }
        System.out.println("########################");

        // 1.2 Sunday, monDay, Tuesday, wednEsday, etc.
        for (int i = 0; i < days.length; i++) {
            if (i % 2 == 0) {
                StringBuilder builder = new StringBuilder();
                System.out.println(builder.append(days[i].toString().substring(0, 1)).append(days[i].toString().substring(1).toLowerCase()));
            } else {
                StringBuilder builder = new StringBuilder();
                int middleOfDayWord = days.length / 2;
                System.out.println(builder.append(days[i].toString().substring(0, middleOfDayWord).toLowerCase()).append(days[i].toString().substring(middleOfDayWord, middleOfDayWord + 1)).append(days[i].toString().substring(middleOfDayWord + 1).toLowerCase()));
            }
        }
        System.out.println("########################");

        // 1.3 Print 10 randomly-chosen days of the week
        Random random = new Random(); // more neutralized random method, not good enough for encryption stuff
        for (int i = 0; i < 10; i++) {
            System.out.println(days[random.nextInt(7)]); // Zufallszahl zwischen 0 und 10
        }
    }
}
