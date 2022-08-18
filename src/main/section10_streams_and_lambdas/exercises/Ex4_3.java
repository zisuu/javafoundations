package section10_streams_and_lambdas.exercises;

import section10_streams_and_lambdas.BigDataReducingWithCollect;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.Year;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.reducing;

/**
 * Add an additional integer price field to your Car class/record. Use Streams to add total
 * cost of all cars in your collection/stream. (Two ways to do this)
 */
public class Ex4_3 {

    protected static final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    record Car(String make, String model, Year year, BigDecimal price){}

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
            cars.add(new Car("mercedes", "abc",Year.of(2016), new BigDecimal(150000)));
            cars.add(new Car("audi", "a4", Year.of(2017), new BigDecimal(200000)));
            cars.add(new Car("tesla1", "x", Year.of(2018), new BigDecimal(15000)));
            cars.add(new Car("tesla2", "y", Year.of(2019), new BigDecimal(20000)));
            cars.add(new Car("tesla3", "z", Year.of(2020), new BigDecimal(23000)));

        String totalPriceSum = cars.stream()
                .map(Car::price)
                .collect(collectingAndThen(reducing(BigDecimal.ZERO, BigDecimal::add), NumberFormat.getCurrencyInstance()::format));
//                .forEach(System.out::println);
        System.out.println(totalPriceSum);

    }
}
