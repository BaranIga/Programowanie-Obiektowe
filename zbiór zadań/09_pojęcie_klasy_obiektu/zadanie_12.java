//Wykonaj kolejno poniższe czynności:

//Stwórz klasę Person z polem name. Dodaj do klasy metodę introduceYourself, która wyświetli wiadomość “Hi, I’m” i imię osoby. W klasie TestPerson,
//utwórz obiekt Person i wywołaj na nim metodę introduceYourself. Czy musisz użyć słowo kluczowe this w implementacji metody?

//Dodaj do klasy Person metodę sayHello, która jako argument przyjmuje inny obiekt klasy Person i wyświetla wiadomość “Hello,” i imię drugiej osoby.
//Przeanalizuj działanie.

//Dodaj do klasy Person metodę changeName, która jako argument przyjmuje łańcuch znaków i przypisuje go do pola name. Utwórz obiekt Person i użyj 
//metody changeName do zmiany jego imienia. Następnie wywołaj metodę introduceYourself. Czy imię zostało zmienione? Czy musisz użyć słowo kluczowe 
//this w implementacji metody?

//Dodaj do klasy Person metodę swapNames, która jako argument przyjmuje inny obiekt klasy Person i zamienia imionami obie osoby. Utwórz dwa 
//obiekty Person i użyj metody swapNames do zamiany ich imion. Następnie wywołaj metodę introduceYourself na obu obiektach. Czy imiona zostały 
//zamienione?

public class Person {

    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Hi, I'm " + this.name);
    }

    public void sayHello(Person otherPerson) {
        System.out.println("Hello, " + otherPerson.name);
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public void swapNames(Person otherPerson) {
        String temp = this.name;
        this.name = otherPerson.name;
        otherPerson.name = temp;
    }
}


public class TestPerson {

    public static void main(String[] args) {
        Person person = new Person("Stefan");
        person.introduceYourself();

        Person person1 = new Person("Freya");
        person1.sayHello(person1);

        person1.changeName("Elena");
        person1.introduceYourself();

        Person person2 = new Person("Kol");
        Person person3 = new Person("Elijah");
        person2.swapNames(person3);
        person2.introduceYourself();
        person3.introduceYourself();
    }
}
