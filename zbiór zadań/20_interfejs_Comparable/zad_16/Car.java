package zad_16;

import java.util.Arrays;

public class Car implements Comparable<Car> {
    String name;
    String model;
    String registrationNumber;

    public Car(String name, String model, String registrationNumber) {
        this.name = name;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return name + " " + model + " " + registrationNumber;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.registrationNumber.length(), o.registrationNumber.length());
    }


    public static void main(String[] args) {
        Car[] cars = new Car[] {
                new Car("Toyota", "Corolla", "ABC123"),
                new Car("Ford", "Focus", "XYZ12345"),
                new Car("Honda", "Civic", "A123"),
                new Car("Tesla", "Model S", "TESLAX")
        };

        Arrays.sort(cars);

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
