// Utwórz klasę Person zawierającą pole name. W klasie TestPerson, utwórz dwa 
//obiekty klasy Person - person1 i person2 - oba odnoszące się do tego samego obiektu.Zmień wartość 
//pola name przez person1 i wydrukuj wartość pola name przez person2. Przeanalizuj wynik.

// KLASA Person

public class Person {

    public String name;

}

// KLASA TestPerson

public class TestPerson {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Damon";

        Person person2 = person1;

        person1.name = "Caroline";

        System.out.println(person2.name);


    }
}
