package section9_collections.exercises.ex1;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.*;

/**
 * Same as exercise 5 but allow program to remove a model by passing the model name as an argument
 * to the main() method. For example, if you had been getting the following output initially:
 * Car[make=Tesla, model=3, year=2016]
 * Car[make=Tesla, model=Roadster, year=2009]
 * Car[make=Tesla, model=S, year=2014]
 * Car[make=Tesla, model=X, year=2015]
 * Car[make=Tesla, model=Y, year=2017]
 *
 * And then you modify the program as instructed and pass in “Roadster” as an argument and re-run, you’d get the following output:
 * Car[make=Tesla, model=3, year=2016]
 * Car[make=Tesla, model=S, year=2014]
 * Car[make=Tesla, model=X, year=2015]
 * Car[make=Tesla, model=Y, year=2017]
 */
public class Ex6 {
    public static void main(String[] args) {

        List<Car> cars = new LinkedList<>();
        cars.add(new Car("Tesla", "3", Year.of(2016)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009)));
        cars.add(new Car("Tesla", "S", Year.of(2014)));
        cars.add(new Car("Tesla", "X", Year.of(2015)));
        cars.add(new Car("Tesla", "Y", Year.of(2017)));

//        Collections.sort(cars);

        for (Iterator<Car> it = cars.iterator(); it.hasNext();) {
            if (it.next().getModel().equals(args[0])) {
                it.remove();
            }
        }

        for (Car car : cars) {
            System.out.println(car);
        }

//        Exercise 8: How could you take your collection of cars from exercise 6 and store them in an array
//        efficiently? How could you convert that array of cars back into a list again?
        Car[] carArray = cars.toArray(new Car[0]);
        List<Car> carList = Arrays.asList(carArray);
    }
}
