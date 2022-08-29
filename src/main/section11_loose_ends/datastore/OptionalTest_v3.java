package section11_loose_ends.datastore;

import java.time.Year;
import java.util.Optional;

public class OptionalTest_v3 {
    record Car(String make, String model, String color, Year year) {}
    record Person(String firstName, String lastName, Optional<Car> car) {}
    public static void main(String[] args) {
        Person p1 = new Person("Tom", "Thumb", Optional.of(new Car("Tesla", "X", "Red", Year.of(2018))));
        Person p2 = new Person("Jerry", "Thumb", Optional.of(new Car("Tesla", "Y", "White", Year.of(2020))));
        Person p3 = null;

        Optional<Person> optPerson = Optional.ofNullable(p2);
//        System.out.println(optPerson.map(person -> person.firstName)); // traditional lambda expression
        System.out.println(optPerson
                .flatMap(Person::car)
                .map(Car::make)
                .orElse("Unknown firstName"));
    }
}
