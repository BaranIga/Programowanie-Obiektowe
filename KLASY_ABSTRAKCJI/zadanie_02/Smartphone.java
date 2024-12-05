public class Smartphone extends ElectronicDevice {

    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Smartphone");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn Off Smartphone");
    }
}
