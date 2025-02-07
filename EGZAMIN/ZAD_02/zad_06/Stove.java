package zad_06;

public class Stove implements  Cloneable {
    private int burners;
    private String brand;
    private String serialNumber;

    public Stove(int burners, String brand, String serialNumber) {
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    public Stove clone() throws CloneNotSupportedException {
        return (Stove) super.clone();
    }

    public int getBurners() {
        return burners;
    }

    public String getBrand() {
        return brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Stove [burners=" + getBurners() + ", brand=" + getBrand() + ", serialNumber=" + getSerialNumber() + "]";
    }
}
