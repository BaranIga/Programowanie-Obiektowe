// Stwórz klasę Car, która będzie zawierać trzy pola: brand, model, productionYear. 
// Zaimplementuj trzy konstruktory - pierwszy domyślny, drugi przyjmujący dwa argumenty 
// (brand i model), trzeci przyjmujący trzy argumenty (brand, model, productionYear). 
// W przypadku drugiego i trzeciego konstruktora, nazwy parametrów muszą być takie same 
// jak nazwy pól. Wykorzystaj słowo kluczowe this do rozróżnienia pól klasy od parametrów.


public class Car {

    public String brand;
    public String model;
    public int productionYear;

    public Car() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.productionYear = 0;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }


}
