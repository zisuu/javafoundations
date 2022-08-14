package section9_collections.exercises.ex1;

import java.time.Year;
import java.util.HashSet;
import java.util.Set;

/**
 * If you implemented exercise 2 with a record (instead of a class), do it again using a class or vice-versa.
 */
public class Ex4 {

    record Car (String make, String model, Year year){}

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

    }
}
