package section8_more_oop.exercises.ex8;

public class ChessPiece {

    class Color {

        private String color;
        public static final String WHITE = "white";
        public static final String BLACK = "black";

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }
    private String position;
    private Coordinates coordinates;

    public void setCoordinates(Coordinates coordinates) {
        this.position = position;
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }
}
