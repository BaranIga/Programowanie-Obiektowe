// Napisz klasę Person, która będzie miała pola: firstName, lastName i age. 
// Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, a drugi
// tylko imię i nazwisko. 
// Drugi konstruktor powinien wywołać pierwszy, przekazując mu domyślną wartość wieku jako 0.

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }
}
