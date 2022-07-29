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

    int[][] myPosition;


    public static char getXCoordinate (int position) {
        return (char)(position + 96);
    }

    public static int getYCoordinate (int input) {
        return 8 - input;
    }
}
