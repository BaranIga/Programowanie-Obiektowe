// Stwórz listę tablicową (ArrayList) obiektów klasy Person (klasa zawiera publiczne pole
// name). Następnie spróbuj odwołać się do pola name jednego z obiektów na liście, nie dodając 
// wcześniej do listy żadnych obiektów Person. Przeanalizuj wynik.

public class Person {

    public String name;

}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();

        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Enzo";
        person2.name = "Bonnie";
        person.add(person1);
        person.add(person2);


        System.out.println(person.get(0).name);
        System.out.println(person.get(1).name);
    }
}
