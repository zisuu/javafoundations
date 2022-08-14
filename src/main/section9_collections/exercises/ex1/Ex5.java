package section9_collections.exercises.ex1;

import java.time.Year;
import java.util.*;

/**
 * Allow the cars from exercise 2 to be printed in “natural” order by model.
 */
public class Ex5 {
    public static void main(String[] args) {

        List<Car> cars = new LinkedList<>();
        cars.add(new Car("mercedes", "abc", Year.of(2016)));
        cars.add(new Car("audi", "a4", Year.of(2017)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));

        Collections.sort(cars);

        for (Car car : cars) {
            System.out.println(car.toString());
        }


    }
}
