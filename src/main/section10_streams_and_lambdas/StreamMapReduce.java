package section10_streams_and_lambdas;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapReduce {
    public static void main(String[] args) {
        Optional<String> output = Stream.of("tim", "jerry", "mary", "sam")
                .map(String::toUpperCase)
                .reduce((a, b) -> a.concat("_").concat(b));
        System.out.println(output.orElse(null));
    }

}