package section5_numbers.exercises;

public class Exercise3 {

    private String[] names = {"hans", "fans", "aans", "agns", "ahns", "ahjs", "jhjsm", "khjs", "shjs", "fhjs"};
    private int index = 0;

    public String next(){
        String person = names[index++];
        return person.substring(0,1).toUpperCase().concat(person.substring(1));
    }

    public static void main(String[] args) {
        Exercise3 exercise3 = new Exercise3();
        System.out.println(exercise3.next()); // call 1
        System.out.println(exercise3.next()); // call 2
        System.out.println(exercise3.next()); // call 3
        // and so on ...
    }
}
