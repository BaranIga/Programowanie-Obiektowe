//Stwórz klasę Dog, która posiada pola: name, breed i age. Klasa powinna mieć dwa
//konstruktory: jeden, który przyjmuje wszystkie trzy parametry, a drugi, który 
//przyjmuje tylko imię i rasę. Drugi 
//konstruktor powinien wywoływać pierwszy, przekazując mu domyślną wartość wieku jako 1.

public class Dog {

    public String name;
    public String breed;
    public int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public Dog(String name, String breed) {
        this(name, breed, 1);
    }
}
