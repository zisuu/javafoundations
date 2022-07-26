package section8_more_oop;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2660');

    private char symbol;

    Suit(char character) {
        this.symbol = character;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }
}
