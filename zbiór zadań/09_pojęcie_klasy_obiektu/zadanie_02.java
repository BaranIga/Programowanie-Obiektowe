public class Car {

    public String brand;
    public String model;
    public int speed;

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void accelerate(int value) {
        speed += value;
    }

    public void decelerate(int value) {
        speed -= value;
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "niebieskie", 180);
        System.out.println(car.speed);
        car.accelerate(20);
        System.out.println(car.speed);
        car.decelerate(10);
        System.out.println(car.speed);
    }
}
