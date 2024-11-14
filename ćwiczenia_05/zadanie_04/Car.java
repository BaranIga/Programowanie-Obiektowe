//Wykonaj kolejno poniższe czynności:
//Stwórz klasę bazową Vehicle z metodą drive, która wypisuje “The vehicle is moving.”. 
//Następnie stwórz klasę potomną Car, która nadopisuje metodę drive tak, by wypisywała 
//“The car is moving.”. Utwórz obiekt klasy Car i wywołaj jego metodę drive, aby 
//zaobserwować wynik.
//Na bazie klasy Vehicle z poprzedniego podpunktu, w klasie Car, nadpisz metodę 
//drive tak, by wywoływała oryginalną metodę z klasy bazowej i dodatkowo wypisywała 
//informacje specyficzne dla klasy Car. Użyj słowa kluczowego super, aby wywołać 
//metodę z klasy bazowej.


public class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("The car is moving");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
