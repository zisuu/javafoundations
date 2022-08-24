package section11_loose_ends;

public class ExceptionTests_v2 {
    public static void main(String[] args) {
        doSecondLevel();
        System.out.println("You made it to the end");
    }

    private static void doSecondLevel() {
        String[] array = {"one", "two", "three"};
        int num = 0;
        try {
            System.out.println(array.length / num);
            System.out.println(array[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e ) {
            System.out.printf("Exception type: %s. Message: %s%n", e.getClass(), e.getMessage());
            e.printStackTrace();
        }
    }
}
