package section10_streams_and_lambdas.exercises;

import section10_streams_and_lambdas.BigDataNestedGroups;
import section10_streams_and_lambdas.BigDataReducingWithCollect;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * Add more different makes of cars to your collection of cars and then
 * 1. Determine total price by make
 * 2. Determine average car price by make
 * 2.1 This one will be fun/challenging. You’ll want to take a look at the Collectors.teeing() function,
 * which I did not explicitly teach but have a look at its javadoc. If this proves to be too hard but you
 * want to still try it without looking @ my solution, it will be MUCH easier if you convert the prices to
 * any other numeric type before using Streams API (but not as much fun...)
 * 2.2 Did you get 7.2.1? Let’s make it even more fun. Format the average prices for currency, within the
 * Streams API.
 * 3. Determine number of cars by year and then by make
 * 4. Determine number of cars by make by first creating a new, empty Map, then iterating
 * over the collection of cars (you’ve been using for previous exercises) and using a functional method
 * of the Map interface to populate your empty Map.
 */
public class Ex7 {

    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();

    record Car(String make, String model, Year year, BigDecimal price){}

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Tesla", "S", Year.of(2014), new BigDecimal(90000.99)));
        cars.add(new Car("Tesla", "X", Year.of(2015), new BigDecimal(110000.99)));
        cars.add(new Car("Tesla", "3", Year.of(2016), new BigDecimal(55000.99)));
        cars.add(new Car("Tesla", "Y", Year.of(2017), new BigDecimal(60000.99)));
        cars.add(new Car("Tesla", "Roadster", Year.of(2009), new BigDecimal(135000.99)));
        cars.add(new Car("Lucid", "Air", Year.of(2021), new BigDecimal(77399.99)));
        cars.add(new Car("Hyundai", "Ioniq", Year.of(2021), new BigDecimal(34250.00)));
        cars.add(new Car("Hyundai", "Kona", Year.of(2021), new BigDecimal(38575.00)));
        cars.add(new Car("Porsche", "Taycan", Year.of(2021), new BigDecimal(81250.00)));
        cars.add(new Car("Audi", "e-tron", Year.of(2021), new BigDecimal(66995.00)));
        cars.add(new Car("Volkswagen", "ID.4", Year.of(2021), new BigDecimal(41190.00)));

        // Exercise 7.1
//        Map<String, String> result = cars.stream().collect(
//                groupingBy(
//                        Car::make,
//                        reducing(BigDecimal.ZERO, Car::price, BigDecimal::add)));
//
        // Exercise 7.2 Determine average car price by make
//        Map<String, BigDecimal> result = cars.stream()
//                .collect(groupingBy(
//                        Car::make,
//                        teeing(
//                                reducing(BigDecimal.ZERO, Car::price, BigDecimal::add),
//                                counting(),
//                                (sum, count) -> sum.divide(new BigDecimal(count))
//                        )
//                ));
            Map<String, String> result = cars.stream()
            .collect(groupingBy(
                    Car::make,
                    collectingAndThen(
                        teeing(
                                reducing(BigDecimal.ZERO, Car::price, BigDecimal::add),
                                counting(),
                                (sum, count) -> sum.divide(new BigDecimal(count))
                        )
                    , moneyFormat::format)
            ));
        System.out.println(result);
    }
}
