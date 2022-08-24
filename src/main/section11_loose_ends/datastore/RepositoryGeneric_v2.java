package section11_loose_ends.datastore;

import java.util.ArrayList;
import java.util.List;

public class RepositoryGeneric_v2<T extends RepositoryGeneric_v2.IDable<V>, V> {
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

    T findById(long id) {
        return records.stream().filter(p -> p.id().equals(id)).findFirst().orElseThrow();
    }

    public static void main(String[] args) {
        RepositoryGeneric_v2<Person, Long> pRepo = new RepositoryGeneric_v2<>();
        pRepo.save(new Person("Chuck", "Norris", 10L));
        pRepo.save(new Person("Max", "Müller", 20L));
        pRepo.save(new Person("Hans", "Wurst", 30L));

        Person foundPerson = pRepo.findById(30L);
        System.out.println(foundPerson);

//        System.out.println(pRepo.findAll());
    }
}
