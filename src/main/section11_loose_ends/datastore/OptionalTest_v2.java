package section11_loose_ends.datastore;

import java.util.Optional;

public class OptionalTest_v2 {
    public static void main(String[] args) {
        String msg = "cats";
        Optional<String> optMsg = Optional.ofNullable(msg);
        System.out.println(optMsg.filter(s -> s.length() > 3).orElse("invalid"));
    }
}
