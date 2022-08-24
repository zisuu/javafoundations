package section11_loose_ends.datastore;

import java.util.ArrayList;
import java.util.List;

public class RepositoryString {
    private List<String> records = new ArrayList<>();

    List<String> findAll() {
        return records;
    }

    String save(String record) {
        records.add(record);
        return record;
    }

    String findById(long id) {
        return records.get(Long.valueOf(id).intValue());
    }

    public static void main(String[] args) {
        RepositoryString repo = new RepositoryString();
        repo.save("house");
        repo.save("tree");
        repo.save("boat");

        System.out.println(repo.findAll());
    }
}
