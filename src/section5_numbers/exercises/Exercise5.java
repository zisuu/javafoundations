package section5_numbers.exercises;

import java.util.Random;

public class Exercise5 {

    private int sum = 0;

    public int next(){
        this.sum += new Random().nextInt(10);
        return this.sum;
    }

    public static void main(String[] args) {
        Exercise5 exercise4 = new Exercise5();
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
