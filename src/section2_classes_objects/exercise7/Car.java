package section2_classes_objects.exercise7;

// Model a Car, create an instance of it, pass it to System.out.println() so that its properties will
//be printed.

import java.time.LocalDate;

public class Car {

    private String vendor;
    private String model;
    private LocalDate dateOfCreation;
    private int numOfPassenger;
    private String fuelType;;
    private int weight;


    public Car(String vendor, String model, LocalDate dateOfCreation, int numOfPassenger, String fuelType, int weight) {
        this.vendor = vendor;
        this.model = model;
        this.dateOfCreation = dateOfCreation;
        this.numOfPassenger = numOfPassenger;
        this.fuelType = fuelType;
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Car{" +
                "vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", dateOfCreation=" + dateOfCreation  +
                ", numOfPassenger=" + numOfPassenger +
                ", fuelType='" + fuelType + '\'' +
                ", weight=" + weight +
                '}';
    }

    public static void main(String[] args) {
        Car myCar = new Car("Audi","A8",LocalDate.of(2022,7,11),4,"Electro",4500);
        System.out.println(myCar.toString());
    }
}