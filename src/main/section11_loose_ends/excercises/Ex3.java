package section11_loose_ends.excercises;

import section11_loose_ends.datastore.OptionalTest_v5;
import section9_collections.IEmployee;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

/**
 * Create a collection of at least five Person objects with first name & last name fields. Add a
 * few null objects to the collection in random places. Use an enhanced for-loop to iterate over
 * the collection and print out the first names of each person. Use Optional to prevent NullPointerException
 * and to print “Unknown” for the first names of null items.
 */
public class Ex3 {
    record Person(String firstName, String lastName){}
    public static void main(String[] args) {
        List<Person> people = new LinkedList<>();
        people.add(new Person("Hans", "Müller"));
        people.add(null);
        people.add(new Person("Fritz", "Muster"));
        people.add(new Person("Peter", "Gerber"));
        people.add(null);
        people.add(new Person("Max", "Platt"));
        people.add(null);
        people.add(new Person("Moritz", "Besenstiel"));

        for(Person person : people) {
            System.out.println(Optional.ofNullable(person)
                    .map(Person::firstName)
                    .filter(n -> n.length() > 3)
                    .orElse("Unknown"));
        }
    }
}
