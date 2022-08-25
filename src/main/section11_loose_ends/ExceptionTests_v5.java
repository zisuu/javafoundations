package section11_loose_ends;

public class ExceptionTests_v5 {
    public static void main(String[] args) {
        doSecondLevel(0);
        System.out.println("You made it to the end");
    }

    private static void doSecondLevel(int num) {
        String[] array = {"one", "two", "three"};
        if (num != 0) {
            System.out.println(array.length / num);
        }
        int index = 3;
        if (index < array.length) {
            System.out.println(array[3]);
        }
    }
}
