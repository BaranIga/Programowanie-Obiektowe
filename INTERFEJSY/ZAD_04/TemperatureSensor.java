public class TemperatureSensor implements Sensor {

    double temperature;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return "Zwracaj coś tutaj";
    }

    @Override
    public void reset() {

    }
}
