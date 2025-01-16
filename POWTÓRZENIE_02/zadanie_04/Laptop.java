import java.time.LocalDate;

public class Laptop implements Cloneable {
    String brand;
    String model;
    LocalDate purchaseDate;

    public Laptop(String brand, String model, LocalDate purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.purchaseDate = purchaseDate;
    }

    public String getBrand() {
        return brand;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public String getModel() {
        return model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return brand + ", " + model + ", " + purchaseDate;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        return cloned;
    }


    public static void main(String[] args) {
        Laptop originalLaptop = new Laptop("A", "drugi", LocalDate.of(2020, 10, 25));
        Laptop originalLaptop2 = null;

        try {
            Laptop clonedLaptop = (Laptop) originalLaptop.clone();

            originalLaptop.setPurchaseDate(LocalDate.of(2024, 01, 01));

            System.out.println("Oryginalny laptop: " + originalLaptop);
            System.out.println("Sklonowany laptop: " + clonedLaptop);
        } catch (CloneNotSupportedException e) {
            System.err.println("Klonowanie nie jest obsługiwane: ");
        }
    }
}
