package section11_loose_ends.datastore;

import java.util.ArrayList;
import java.util.List;

public class RepositoryGeneric_v1<T> {
    private List<T> records = new ArrayList<>();

    List<T> findAll() {
        return records;
    }

    T save(T record) {
        records.add(record);
        return record;
    }

    T findById(long id) {
        return records.get(Long.valueOf(id).intValue());
    }

    public static void main(String[] args) {
        RepositoryGeneric_v1<String> repo = new RepositoryGeneric_v1<>();
        repo.save("house");
        repo.save("tree");
        repo.save("boat");

        System.out.println(repo.findAll());
    }
}
