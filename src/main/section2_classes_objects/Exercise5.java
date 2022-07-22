package section2_classes_objects;

// Write a method that allows you to pass any number of Strings as parameter inputs without using an array.

public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 test = new Exercise5();
        test.multiStringMethod("Apfel", "Brine", "Hund");
        test.multiStringMethod("agrg1", "arg2", "arg3");
    }

    public void multiStringMethod(String ... args){

    }
}
