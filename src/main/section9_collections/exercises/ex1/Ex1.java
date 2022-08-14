package section9_collections.exercises.ex1;

import section9_collections.IEmployee;

import java.time.Year;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Write code that allows you to model and store a collection of at least 5 cars and keeps them in the order in
 * which they were entered. Print them out to the screen also.
 */
public class Ex1 {
    public static void main(String[] args) {

        List<Car> cars = new LinkedList<>();
        cars.add(new Car("mercedes", "abc", Year.of(2016)));
        cars.add(new Car("audi", "a4", Year.of(2017)));
        cars.add(new Car("tesla1", "x", Year.of(2018)));
        cars.add(new Car("tesla2", "y", Year.of(2019)));
        cars.add(new Car("tesla3", "z", Year.of(2020)));

        for (Car car : cars) {
            System.out.println(car.toString());
        }

        //Collections.sort(employees, Comparator.naturalOrder());

    }
}
