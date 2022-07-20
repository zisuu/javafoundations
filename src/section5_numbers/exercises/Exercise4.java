package section5_numbers.exercises;

/**
 * categorize items by time they sat in a warehouse.
 * Categories: 0, 1, 2, 3
 * 0: < 89 days;
 * 1: 90-179 days;
 * 2: 180-269 days;
 * 3: 270-364 days;
 *
 * given wait times: 13,49,90,130,175,181,255,310,330,359
 */
public class Exercise4 {
    private int[] items = {13,49,90,130,175,181,255,310,330,359};
    private int index = 0;

    public int next(){
        return items[index++] / 90;
    }

    public static void main(String[] args) {
        Exercise4 exercise4 = new Exercise4();
        System.out.println(exercise4.next()); // call 1
        System.out.println(exercise4.next()); // call 2
        System.out.println(exercise4.next()); // call 3
        System.out.println(exercise4.next()); // call 4
        System.out.println(exercise4.next()); // call 5
        System.out.println(exercise4.next()); // call 6
        System.out.println(exercise4.next()); // call 7
        System.out.println(exercise4.next()); // call 8
        System.out.println(exercise4.next()); // call 9
        System.out.println(exercise4.next()); // call 10
    }
}
