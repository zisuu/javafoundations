package section8_more_oop.exercises.ex8;

public class ChessBoard {
    private ChessPiece[][] internalboard = new ChessPiece [8][8];
    private ChessPiece[] whiteCapturedPieces = new ChessPiece [0];
    private ChessPiece[] blackCapturedPieces = new ChessPiece [0];

    public void add(ChessPiece chesspiece, String position) {
        Coordinates coords = new Coordinates(position);
        chesspiece.setCoordinates(coords);
        internalboard[coords.getX()][(coords.getY())] = chesspiece;
    }


    public ChessPiece getPieceAtCoords(String position) {
        Coordinates coords = new Coordinates(position);
        return internalboard[coords.getX()][(coords.getY())];
    }
}
