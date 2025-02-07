package K21;

import java.util.LinkedList;

public class EmptyListUtils {

    public static <E> boolean isListEmpty(LinkedList<E> list) {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();
        System.out.println("Is list empty: " + isListEmpty(people));

        people.add(new Person("Alice", 25));
        System.out.println("Is list empty: " + isListEmpty(people));
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
