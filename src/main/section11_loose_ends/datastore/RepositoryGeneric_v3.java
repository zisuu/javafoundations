package section11_loose_ends.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RepositoryGeneric_v3<T extends RepositoryGeneric_v3.IDable<V>, V> {
    record Person(String fristName, String lastName, Long id) implements IDable<Long>{};
    interface IDable<U> {
        U id();
    }
    private List<T> records = new ArrayList<>();

    List<T> findAll() {
        return records;
    }

    T save(T record) {
        records.add(record);
        return record;
    }

    static <T,V> V encrypt(T data, Function<T, V> func) {
        return func.apply(data);
    }

    T findById(long id) {
        return records.stream().filter(p -> p.id().equals(id)).findFirst().orElseThrow();
    }

    public static void main(String[] args) {
        RepositoryGeneric_v3<Person, Long> pRepo = new RepositoryGeneric_v3<>();
        pRepo.save(new Person("Chuck", "Norris", 10L));
        pRepo.save(new Person("Max", "Müller", 20L));
        pRepo.save(new Person("Hans", "Wurst", 30L));

        Person foundPerson = pRepo.findById(30L);
        System.out.println(foundPerson);

//        System.out.println(pRepo.findAll());

        System.out.println(RepositoryGeneric_v3.<String, String>encrypt("Hello", m -> m.toUpperCase()));
        System.out.println(RepositoryGeneric_v3.<String, Integer>encrypt("Test", m -> m.hashCode()));
    }
}
