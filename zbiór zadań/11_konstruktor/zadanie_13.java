//Stwórz klasę Person z prywatnymi polami: firstName, lastName, age, address. 
//Dodaj konstruktor, który przyjmuje wszystkie pola jako argumenty. Dodaj 
//metody dostępowe (gettery i settery) oraz metodę introduceYourself(), 
//która zwraca łańcuch znaków z informacjami o osobie.

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String introduceYourself() {
        return "Hi, I'm " + firstName + " " + lastName + ". I'm " + age + "and I live at " + address;
    }


    public static void main(String[] args) {
        Person person = new Person("Damon", "Salvatore", 178, "Mystic Falls");
        System.out.println(person.introduceYourself());
    }
}
