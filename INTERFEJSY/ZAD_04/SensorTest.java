public class SensorTest {

    public static void main(String[] args) {
        PressureSensor pressureSensor = new PressureSensor(250.25);
        TemperatureSensor temperatureSensor = new TemperatureSensor(1080.50);

        System.out.println("PressureSensor");
        System.out.println(pressureSensor.readValue());
        System.out.println(pressureSensor.getStatus());
        pressureSensor.reset();

        System.out.println("TemperatureSensor");
        System.out.println(temperatureSensor.readValue());
        System.out.println(temperatureSensor.getStatus());
        temperatureSensor.reset();
    }
}
