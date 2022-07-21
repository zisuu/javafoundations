package section6_control_flow;

public class ForLoop3 {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pear", "plum"};
        for (String fruit : fruits){
            System.out.printf("the current fruit is %s%n", fruit);
        }
    }
}
