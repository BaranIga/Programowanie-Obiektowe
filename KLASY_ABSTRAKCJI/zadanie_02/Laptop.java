public class Laptop extends ElectronicDevice {

    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Laptop");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Laptop");
    }
}
