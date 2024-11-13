//Stwórz klasę Car zawierającą prywatne pola: brand, model, productionYear, mileage 
//oraz color. Dodaj konstruktor, który przyjmuje wszystkie pola jako argumenty. 
//Dodaj metody dostępowe (gettery i settery) dla wszystkich pól. Następnie dodaj
//metodę displayInformation(), która wyświetla wszystkie informacje o samochodzie

public class Car {

    private String brand;
    private String model;
    private int productionYear;
    private int mileage;
    private String color;

    public Car(String brand, String model, int productionYear, int mileage, String color) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void displayInformation() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Production Year: " + productionYear);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Color: " + color);
    }


    public static void main(String[] args) {
        Car car = new Car("BMW", "second", 2024, 200, "gold");
        car.displayInformation();
    }


}
