package section8_more_oop.exercises.ex8;

public class Coordinates {

    private final int x;
    private final int y;
    private String chessCoords;

    public Coordinates(String chessCoords) {
        this.chessCoords = chessCoords;
        char file = chessCoords.charAt(0);
        int rank = Integer.parseInt(Character.toString(chessCoords.charAt(1)));
        x = getXForFile(file);
        y = getYForRank(rank);
    }

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int getXForFile(char file) {
        return file - 97;
    }


    private int getYForRank(int rank) {
        return 8 - rank;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPositionHuman() {
        return chessCoords;
    }

    public void setPositionHuman(String positionHuman) {
        this.chessCoords = positionHuman;
    }

}
