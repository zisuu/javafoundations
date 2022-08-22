package section11_loose_ends;

public class ExceptionTests {
    public static void main(String[] args) {
        String[] array = {"one", "two", "three"};
        int num = 1;
        try {
            System.out.println(array.length / num);
            System.out.println(array[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("You made it to the end");
    }
}
