package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 */
public class Ex3 {

    record Car(String make, String model, Year year){}

    public static void main(String[] args) {
        Stream.of(new Car("mercedes", "X", Year.of(2018)), new Car ("bmw", "q3", Year.of(2020)))
                .forEach(System.out::println);

    }
}
