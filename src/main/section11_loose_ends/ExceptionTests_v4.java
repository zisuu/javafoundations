package section11_loose_ends;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExceptionTests_v4 {
    public static void main(String[] args) {
        try {
            Files.lines(Path.of("blababla"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("We are unable to open the file");
        } finally {
            System.out.println("Make sure this runs no matter what...");
        }
    }
}
