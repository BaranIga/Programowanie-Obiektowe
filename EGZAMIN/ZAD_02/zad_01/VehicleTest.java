package zad_01;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Vehicle.info());

        car.startEngine("benzyna");
        car.startEngine("elektryczny");

        System.out.println("Czy może jechać (paliwo 10)? " + car.canDrive(10));
        System.out.println("Czy może jechać (paliwo 3)? " + car.canDrive(3));

        car.honk(); // Testowanie klaksonu
        car.stop();
    }
}
