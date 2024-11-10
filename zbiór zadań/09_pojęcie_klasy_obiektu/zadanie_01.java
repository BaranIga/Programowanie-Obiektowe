public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void bark() {
        System.out.println("Wow Wow");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Reks", "Jamnik", 3);
        dog.bark();
    }
}
