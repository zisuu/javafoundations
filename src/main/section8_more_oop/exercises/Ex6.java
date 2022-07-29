package section8_more_oop.exercises;

/**
 * Write a method that takes the following inputs and returns the corresponding outputs:
 * 8->0, 7->1, 6->2, 5->3, 4->4, 3->5, 2->6, 1->7
 */
public class Ex6 {

//    private static final int[] myArray = {8,7,6,5,4,3,2,1};

    public static void main(String[] args) {
        System.out.println(validate(5));
    }

    public static int validate (int input) {
//        int index = 0;
//        while (input != myArray[index]) {
//            index++;
//        }
//
//        return index;
        return 8 - input;
    }
}
