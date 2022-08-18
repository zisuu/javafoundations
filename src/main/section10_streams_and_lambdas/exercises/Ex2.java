package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

/**
 * How could you use the Streams API to filter out (not show) all cars made before a certain
 * year? (If you modeled Car year using the Year date/time class, it has a method isAfter())
 */
public class Ex2 {

    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
            cars.add(new Car("mercedes", "abc",Year.of(2016)));
            cars.add(new Car("audi", "a4", Year.of(2017)));
            cars.add(new Car("tesla1", "x", Year.of(2018)));
            cars.add(new Car("tesla2", "y", Year.of(2019)));
            cars.add(new Car("tesla3", "z", Year.of(2020)));

        cars.stream()
                .filter(c -> c.year.isAfter(Year.of(2018)))
                .forEach(System.out::println);

    }
}
