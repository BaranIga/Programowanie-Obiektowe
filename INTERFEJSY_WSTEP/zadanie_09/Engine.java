public class Engine implements Cloneable{
    int power;
    String type;
    String serialNumber;

    public Engine(int power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return power + " " + type + " " + serialNumber;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Engine engine = new Engine(200, "Diesel", "SN123456");

            Car originalCar = new Car("Toyota", "Corolla", engine);

            Car clonedCar = (Car) originalCar.clone();

            originalCar.getEngine().setPower(250);

            System.out.println("Oryginalny samochód: " + originalCar);
            System.out.println("Sklonowany samochód: " + clonedCar);

        } catch (CloneNotSupportedException e) {
            System.err.println("Klonowanie nie jest obsługiwane: ");
        }
    }
}

class Car implements Cloneable {
    String make;
    String model;
    Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + engine;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone();
        cloned.engine = (Engine) engine.clone();
        return cloned;
    }
}
