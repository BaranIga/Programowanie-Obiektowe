/* Stwórz klasę Car z polami: brand, model i speed. Napisz metody accelerate(int value) i decelerate(int value),
które odpowiednio zwiększają i zmniejszają prędkość o podaną wartość. Stwórz przypadek testowy, aby wywołać każdą
metodę co najmniej jeden raz. */

// package zadanie_01;

public class Car {
    public String brand;
    public String model;
    public int speed;

    public void accelerate(int value) {
        this.speed += value;
    }

    public void decelerate(int value) {
        this.speed -= value;
    }
}


// IN MAIN

// package zadanie_01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "BMW";
        car.model = "blue";
        car.speed = 100;

        System.out.println(car.speed);

        car.accelerate(15);

        System.out.println(car.speed);

        car.decelerate(20);

        System.out.println(car.speed);
    }
}
