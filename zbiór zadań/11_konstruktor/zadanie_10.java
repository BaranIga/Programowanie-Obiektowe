//Zaprojektuj klasę Car, która posiada pola: brand, model i price. Napisz konstruktor,
//który przyjmuje dwa argumenty (brand i model), a w bloku inicjującym ustaw domyślną 
//wartośćprice na 50000. Zobacz, co stanie się, gdy w konstruktorze spróbujesz 
//zmienić wartość price.

public class Car {

    public String brand;
    public String model;
    public int price;

    {
        price = 50000;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 150000;
    }


    public static void main(String[] args) {
        Car car = new Car("BMW", "green");
        System.out.println(car.brand);
        System.out.println(car.model);
        System.out.println(car.price);
    }
}
