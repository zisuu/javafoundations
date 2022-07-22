package section2_classes_objects.exercise11;

// Model a class with data that enumerates (associates with a number) the first names of three
// friends, classmates or coworkers. Make it so that this name data will be shared among all
// instances of the class.

public class People {

    public static final String[] friends = {"Sam", "Jake", "Sarah"};

    public String[] getFriends(){
        return People.friends;
    }

    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People();
        People p3 = new People();

        System.out.println(p1.getFriends()[0]);
        System.out.println(p1.getFriends()[1]);
        System.out.println(p1.getFriends()[2]);

        System.out.println(p2.getFriends()[0]);
        System.out.println(p2.getFriends()[1]);
        System.out.println(p2.getFriends()[2]);

        System.out.println(p3.getFriends()[0]);
        System.out.println(p3.getFriends()[1]);
        System.out.println(p3.getFriends()[2]);
    }
}
