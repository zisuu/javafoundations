package section8_more_oop.exercises;

/**
 * If you modeled a chess board in Java using a two-dimensional array, how could you
 * convert chess notation, or coordinate notation of chess, to an element in that two-
 * dimensional array? For example, in the chess board image below, square a8 might map to
 * array[0][0], and h1 might map to array[7][7]. Make a method that takes an input String of a
 * chess coordinate and returns array coordinates. This exercise simply builds on the previous
 * two. Use the following test data:
 */
public class Ex7 {

    public static void main(String[] args) {
//        System.out.println(getArrayCoords("a8"));
//        System.out.println(getArrayCoords("h1"));
//        System.out.println(getArrayCoords("g5"));
//        System.out.println(getArrayCoords("d4"));
        System.out.println(getArrayCoords("b1")); // knight1.0
        System.out.println(getArrayCoords("a3")); // knight1.1
        System.out.println(getArrayCoords("c3")); // knight1.2
        System.out.println(getArrayCoords("g1")); // knight2.0
        System.out.println(getArrayCoords("f3")); // knight2.1
        System.out.println(getArrayCoords("h3")); // knight2.2
        System.out.println(getArrayCoords("c3")); // knight3.0
        System.out.println(getArrayCoords("a4")); // knight3.1
        System.out.println(getArrayCoords("e4")); // knight3.2
        System.out.println(getArrayCoords("e2")); // knight3.3
        System.out.println(getArrayCoords("d1")); // knight3.4
        System.out.println(getArrayCoords("b1")); // knight3.5
        System.out.println(getArrayCoords("a2")); // knight3.6
    }

    public static String getArrayCoords(String input) {
        int x = getXCoordinate(input.charAt(0));
        int y = getYCoordinate(Integer.parseInt(input.substring(1)));
        return String.format("%d,%d", x, y);
    }
    public static int getXCoordinate (char inputX) {
        return inputX - 97;
    }

    public static int getYCoordinate (int inputY) {
        return 8 - inputY;
    }

}
