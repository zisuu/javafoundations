package section10_streams_and_lambdas.exercises;

import java.time.Year;
import java.util.Objects;

/**
 * Write code that allows you to model and store a collection of at least 5 cars and keeps them in the order in
 * which they were entered. Print them out to the screen also.
 */
public class Car implements Comparable{

    public Car(String make, String model, Year year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    private final String make;
    private final String model;
    private final Year year;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(year, car.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }


    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;
        return this.make.compareTo(other.make);
    }
}
