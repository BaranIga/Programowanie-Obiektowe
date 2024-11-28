// coś tu chyba nie działą :(

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Agnieszka", 23);
        Person person2 = new Person("Agnieszka", 23);
        Person person3 = new Person("Agnieszka", 23);
        System.out.println(person1);
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
        System.out.println(person1.hashCode()
                + " " + person2.hashCode()
                + " " + person3.hashCode());
        System.out.println(person1.imie());
        person2.przedstawSie();
    }
}
