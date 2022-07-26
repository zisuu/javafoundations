package section7_testing_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testStingOnePerson(){
        Person person = Person.generateSingle("Billy, Bob, 1234 Big St., Big City, California, 90210");
        assertEquals(person, new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
    }

    @Test
    public void testStingMultiPerson(){
        String peopleStr = "Billy, Bob, 1234 Big St., Big City, California, 90210 | Joe,Smith,5678 Little St., Little City, New York, 20109";
        Person[] people = Person.generateMulti(peopleStr);
        assertEquals(people[0], new Person("Billy", "Bob", "1234 Big St.", "Big City", "California", "90210"));
        assertEquals(people[1], new Person("Joe","Smith","5678 Little St.", "Little City", "New York", "20109"));
    }

}
