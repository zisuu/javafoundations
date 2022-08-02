package section8_more_oop.exercises.ex8;

public class Knight extends ChessPiece{

    public Knight(Color color) {
        super(color);
    }

    @Override
    Coordinates[] getValidMoves() {
        return new Coordinates[0];
    }
}
