package section9_collections.exercises.ex1;

import java.time.Year;
import java.util.*;

/**
 * Same as exercise 1 but associate an owner’s first name with each car. Do not add owner’s name
 * to your car model class. Print out each owner with their car.
 */
public class Ex3 {
    public static void main(String[] args) {

        Map<String, Car> cars = new HashMap();
        cars.put("Bob", new Car("mercedes", "abc", Year.of(2016)));
        cars.put("Jenny", new Car("audi", "a4", Year.of(2017)));
        cars.put("Sarah", new Car("tesla1", "x", Year.of(2018)));

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.printf("%s\t%s%n", entry.getKey(), entry.getValue());
        }

        //Collections.sort(employees, Comparator.naturalOrder());

    }
}
