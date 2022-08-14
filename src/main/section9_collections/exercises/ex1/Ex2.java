package section9_collections.exercises.ex1;

import java.time.Year;
import java.util.*;

/**
 * Same as exercise 1 except we don’t care about retaining the order and we want to ensure that duplicates will not exist.
 */
public class Ex2 {
    public static void main(String[] args) {

        Set<Car> cars = new HashSet<>();
        cars.add(new Car("mercedes", "abc", Year.of(2016)));
        cars.add(new Car("audi", "a4", Year.of(2017)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));

        for (Car car : cars) {
            System.out.println(car.toString());
        }

        //Collections.sort(employees, Comparator.naturalOrder());

    }
}
