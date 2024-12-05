import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();

        electronicDevices.add(new Laptop("Samsung", "red", 2024));
        electronicDevices.add(new Laptop("Samsung", "pink", 2024));
        electronicDevices.add(new Smartphone("Samsung", "blue", 2020));
        electronicDevices.add(new Smartphone("Samsung", "green", 2020));
        electronicDevices.add(new Television("Samsung", "blue", 2020));

        for (ElectronicDevice electronicDevice: electronicDevices) {
            electronicDevice.turnOn();
            electronicDevice.turnOff();
            System.out.println("\n");
        }
    }
}
