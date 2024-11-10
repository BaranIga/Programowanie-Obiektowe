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
