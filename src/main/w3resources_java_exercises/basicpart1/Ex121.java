package w3resources_java_exercises.basicpart1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 121. Write a Java program to reverse a given linked list.
 * Example: For linked list 20->40->60->80, the reversed linked list is 80->60->40->20
 */
public class Ex121 {


    public static void main(String[] args) {
        LinkedList<Integer> sourceList = new LinkedList<>();
        sourceList.add(80);
        sourceList.add(60);
        sourceList.add(40);
        sourceList.add(20);
        System.out.println(sourceList);
        Iterator<Integer> descendingIterator = sourceList.descendingIterator();
        LinkedList<Integer> newList = new LinkedList<>();
        while (descendingIterator.hasNext()) {
            newList.add(descendingIterator.next());
        }
        System.out.println(newList);
    }
}
