public class PressureSensor implements Sensor {

    double pressure;

    public PressureSensor(double pressure) {
        this.pressure = pressure;
    }

    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return "Zwracaj coś tutaj";
    }

    @Override
    public void reset() {

    }
}
