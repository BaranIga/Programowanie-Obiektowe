import java.util.Objects;

public class Person {

    public String firstName;
    public String lastName;
    public int age;

    public Person(String firstName, String lastName, int age) {
        if (firstName == null || firstName.equals("")) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }

        if (lastName == null || lastName.equals("")) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }

        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age);
    }
}
