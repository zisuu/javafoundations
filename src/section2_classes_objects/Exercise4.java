package section2_classes_objects;

// Try creating an array to represent the tic-tac-toe board to the right.
// 4.1.How would you access the value in the bottom right square with Java code?

public class Exercise4 {

    public static void main(String[] args) {
        char[][] tictactoeBoard = {
                {'O','X','X'},
                {'X','O','O'},
                {'X','O','O'}
        };
        System.out.println(tictactoeBoard[2][2]);
    }
}
