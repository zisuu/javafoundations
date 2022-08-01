package section8_more_oop.exercises.ex8;


public class ChessPieceTest {
    protected boolean isMoveFoundInArray(Coordinates[] moves, Coordinates expectedMove) {
        for (int x=0; x < moves.length; x++) {
            if (moves[x].equals(expectedMove)) return true;
        }
        return false;
    }
}
