package section11_loose_ends.datastore;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String msg = "Hello";
        String msg2 = null;
        Optional<String> optMsg = Optional.ofNullable(msg2);

        System.out.println(optMsg.orElseThrow(() -> new RuntimeException("Whoops, Nothing found... ")));
    }
}
