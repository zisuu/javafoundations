package section11_loose_ends.datastore;

import java.time.Year;
import java.util.Optional;

public class OptionalTest_v4 {
    record Car(String make, String model, String color, Year year) {}
    record Person(Long id, String firstName, String lastName, Optional<Car> car) implements RepositoryGeneric_v4.IDable<Long>, RepositoryGeneric_v4.Saveable {}
    public static void main(String[] args) {
        RepositoryGeneric_v4<Person, Long> repo = new RepositoryGeneric_v4<>();
        Person p1 = new Person(100L, "Tom", "Thumb", Optional.of(new Car("Tesla", "X", "Red", Year.of(2018))));
        Person p2 = new Person(200L, "Jerry", "Thumb", Optional.of(new Car("Tesla", "Y", "White", Year.of(2020))));
        Person p3 = null;

        repo.save(p1);
        repo.save(p2);

        String fName = repo.findById(300L)
                .map(Person::firstName)
                .orElse("firstName not found");
        System.out.println(fName);
    }
}
