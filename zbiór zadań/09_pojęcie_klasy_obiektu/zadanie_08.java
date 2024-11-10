// Stwórz tablicę obiektów klasy Car (klasa zawiera publiczne pole brand). Następnie spróbuj odwołać się do pola brand jednego z 
//obiektów w tablicy, nie inicjalizując wcześniej tablicy obiektami Car. Przeanalizuj wynik.

public class Car {

    public String brand;

}

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[3];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].brand = "brand" + (i + 1);
        }

        System.out.println(cars[0].brand);
        System.out.println(cars[1].brand);
        System.out.println(cars[2].brand);
    }
}
