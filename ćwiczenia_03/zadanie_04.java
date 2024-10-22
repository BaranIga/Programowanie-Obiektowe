/* Napisz klasę Person, która będzie miała pola: firstName, lastName i age. Zdefiniuj w niej dwa konstruktory,
jeden przyjmujący wszystkie trzy parametry, a drugi tylko imię i nazwisko. Drugi konstruktor
powinien wywołać pierwszy, przekazując mu domyślną wartość wieku jako 0. */


package zadanie_04;

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

    public static void main(String[] args){
        Person student = new Person("Ala", "Kot");
        System.out.println(student);
        System.out.println(student.firstName);
        System.out.println(student.lastName);
        System.out.println(student.age);
    }
}
