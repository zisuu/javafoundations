package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *Use only the Streams API and a collection or Stream of Car objects to produce the
 * following output: “S, X, 3, Y, Roadster”
 */
public class Ex6 {

    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "S", Year.of(2014)));
        cars.add(new Car("Tesla", "X", Year.of(2015)));
        cars.add(new Car("Tesla", "3", Year.of(2016)));
        cars.add(new Car("Tesla", "Y", Year.of(2017)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009)));

        StringBuilder sb = new StringBuilder();

        Optional<String> models = cars.stream()
                .map(Car::model)
                .reduce((a,b) -> a.concat(", ").concat(b));

        System.out.println(models.get());
    }
}
