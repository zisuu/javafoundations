package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

/**
 * Using the same car collection approach as in the last section’s exercises, create a
 * collection of cars but use the Streams API to print out only the cars’ model names.
 */
public class Ex1 {

    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
            cars.add(new Car("mercedes", "abc",Year.of(2016)));
            cars.add(new Car("audi", "a4", Year.of(2017)));
            cars.add(new Car("tesla1", "x", Year.of(2018)));
            cars.add(new Car("tesla2", "y", Year.of(2019)));
            cars.add(new Car("tesla3", "z", Year.of(2020)));

        cars.stream()
                .map(Car::model)
                .forEach(System.out::println);

    }
}
