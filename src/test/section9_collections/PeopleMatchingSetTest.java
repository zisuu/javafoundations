package section9_collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleMatchingSetTest {

    @Test
    public void testNameToSalary() {
        PeopleMatchingTree peopleMatchingTree = new PeopleMatchingTree();
        peopleMatchingTree.main(new String[0]);
        int salary = peopleMatchingTree.getSalary("Wilma");
        assertEquals(3512, salary);
    }


}