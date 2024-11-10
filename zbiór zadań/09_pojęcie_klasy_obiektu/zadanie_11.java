// Stwórz klasę Cat z polem name. Dodaj do klasy Cat metodę createCat, która zwraca nowy
// obiekt klasy Cat. Metoda powinna ustawiać pole name na podaną wartość, ale tylko 
// jeśli wartość nie jest null. W przeciwnym razie powinna zwracać null. W klasie TestCat
// użyj metody createCat do stworzenia obiektu cat, a następnie spróbuj wydrukować 
// wartość pola name. Co się stanie, jeśli przekażesz null jako argument do metody 
// createCat? Przeanalizuj wynik.

public class Cat {

    public String name;

    public static Cat createCat(String name) {
        if (name != null) {
            Cat cat = new Cat();
            cat.name = name;
            return cat;
        }
        else {
            return null;
        }
    }
}



public class TestCat {

    public static void main(String[] args) {
        Cat cat = Cat.createCat("Pompon");

        if (cat != null) {
            System.out.println(cat.name);
        }
    }

}
