package section8_more_oop.exercises.ex8;

public class Knight extends ChessPiece{

    public Knight(Color color) {
        super(color);
    }

    public Coordinates[] getValidMoves() {
        Coordinates[] validMoves = new Coordinates[]{};

        Coordinates westNorth = getCoordinates().getOffset(-2, calcYWithDirFactor(-1));
        Coordinates northWest = getCoordinates().getOffset(-1, calcYWithDirFactor(-2));

        Coordinates northEast = getCoordinates().getOffset(+1, calcYWithDirFactor(-2));
        Coordinates eastNorth = getCoordinates().getOffset(+2, calcYWithDirFactor(-1));

        Coordinates eastSouth = getCoordinates().getOffset(+2, calcYWithDirFactor(+1));
        Coordinates southEast = getCoordinates().getOffset(+1, calcYWithDirFactor(+2));

        Coordinates southWest = getCoordinates().getOffset(-1, calcYWithDirFactor(+2));
        Coordinates westSouth = getCoordinates().getOffset(-2, calcYWithDirFactor(+1));
        validMoves[0] = westNorth;
        validMoves[1] = northWest;
        validMoves[2] = northEast;
        validMoves[3] = eastNorth;
        validMoves[4] = eastSouth;
        validMoves[5] = southEast;
        validMoves[6] = southWest;
        validMoves[7] = westSouth;

        return validMoves;
    }
}
