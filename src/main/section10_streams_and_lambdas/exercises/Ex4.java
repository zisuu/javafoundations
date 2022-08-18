package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;

/**
 * Add an additional integer price field to your Car class/record. Use Streams to add total
 * cost of all cars in your collection/stream. (Two ways to do this)
 */
public class Ex4 {

    record Car(String make, String model, Year year, int price){}

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
            cars.add(new Car("mercedes", "abc",Year.of(2016), 150000));
            cars.add(new Car("audi", "a4", Year.of(2017), 200000));
            cars.add(new Car("tesla1", "x", Year.of(2018), 15000));
            cars.add(new Car("tesla2", "y", Year.of(2019), 20000));
            cars.add(new Car("tesla3", "z", Year.of(2020), 23000));

        int totalPriceSum = cars.stream()
                .mapToInt(Car::price).sum();
//                .forEach(System.out::println);
        System.out.printf("$%d.00", totalPriceSum);

    }
}
