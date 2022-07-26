package section7_testing_code;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Person(String firstName, String lastName, String streetAddress, String city, String state, String zipcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(streetAddress, person.streetAddress) && Objects.equals(city, person.city) && Objects.equals(state, person.state) && Objects.equals(zipcode, person.zipcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, streetAddress, city, state, zipcode);
    }

    public static Person generateSingle(String personStr) {
        String[] test = personStr.split(",");
        String firstName = test[0].strip();
        String lastName = test[1].strip();
        String streetAddress = test[2].strip();
        String city = test[3].strip();
        String state = test[4].strip();
        String zipcode = test[5].strip();
        return new Person(firstName, lastName, streetAddress, city, state, zipcode);
    }

    public static Person[] generateMulti(String input) {
        String[] peopleStr = input.split("\\|");
        Person[] people = new Person[peopleStr.length];
        for (int i = 0; i < peopleStr.length; i++){
            people[i] = Person.generateSingle(peopleStr[i]);
        }
        return people;
    }
}
