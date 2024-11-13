//Zdefiniuj klasę Car, która ma pola: brand, model i productionYear. Klasa powinna 
//zawierać dwa konstruktory: pierwszy przyjmujący wszystkie trzy parametry, a drugi
//tylko markę i model. Drugi konstruktor powinien
//wywoływać pierwszy, przekazując mu domyślną wartość productionYear jako aktualny rok.

public class Car {

    public String brand;
    public String model;
    public int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public Car(String brand, String model) {
        this(brand, model, 9);
    }
}
