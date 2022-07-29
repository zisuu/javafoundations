package section8_more_oop.exercises;

public enum DaysAndMeal {
    SUNDAY("pot roast"),
    MONDAY("spaghetti"),
    TUESDAY("tacos"),
    WEDNESDAY("chicken"),
    THURSDAY("meatloaf"),
    FRIDAY("hamburgers"),
    SATURDAY("pizza");

    private String meal;

    DaysAndMeal(String meal) {
        this.meal = meal;
    }

    public String getMeal() {
        return meal;
    }
}