package section8_more_oop.exercises.ex8;

import static section8_more_oop.exercises.ex8.ChessPiece.Color.WHITE;
import static section8_more_oop.exercises.ex8.ChessPiece.Color.BLACK;

public class Pawn extends ChessPiece {
    private boolean hasMoved = false;

    private String color;

    public Pawn(String color) {

    }

    public Coordinates[] getValidMoves() {
        // WHITE: start bei [a-h]2 -> +1 = 3,4,5,6.. bis max. [a-h]8, erster Move x+2, +1 Diagonal nur möglich, wenn eine Figur des Gegners dort steht.
        // BLACK: start bei [a-h]7 -> -1 = 6,5,4,3.. bis max. [a-h]1, erster Move x+2, +1 Diagonal nur möglich, wenn eine Figur des Gegners dort steht.
        int numOfPossibleMoves = hasMoved ? 3 : 4;
        Coordinates[] validMoves = new Coordinates[numOfPossibleMoves];

        Coordinates forwardOne = getCoordinates();

        return null;
    }

}
