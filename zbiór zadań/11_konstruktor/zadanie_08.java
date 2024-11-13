// Napisz klasę Student, która ma pola: firstName, lastName i fieldOfStudy. 
//Zdefiniuj w niej dwa konstruktory, jeden przyjmujący wszystkie trzy parametry, 
//a drugi tylko firstName i lastName. Drugi konstruktor powinien wywoływać pierwszy,
//przekazując mu domyślną wartość fieldOfStudy jako unknown.

public class Student {

    public String firstName;
    public String lastName;
    public String fieldOfStudy;

    public Student(String firstName, String lastName, String fieldOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, "unknown");
    }
}
