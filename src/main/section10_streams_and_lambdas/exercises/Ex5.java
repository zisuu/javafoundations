package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Use the Streams API to sort a stream of cars in reverse order by model
 */
public class Ex5 {

    record Car(String make, String model, Year year, int price){}

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
            cars.add(new Car("mercedes", "abc",Year.of(2016), 150000));
            cars.add(new Car("audi", "a4", Year.of(2017), 200000));
            cars.add(new Car("tesla1", "x", Year.of(2018), 15000));
            cars.add(new Car("tesla2", "y", Year.of(2019), 20000));
            cars.add(new Car("tesla3", "z", Year.of(2020), 23000));

        cars.stream()
                .sorted(Comparator.comparing(Car::model).reversed())
                .forEach(System.out::println);
    }
}
