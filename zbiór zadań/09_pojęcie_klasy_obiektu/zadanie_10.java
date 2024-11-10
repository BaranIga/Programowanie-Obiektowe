public class Dog {

    public void bark() {
        System.out.println("Woof! Woof!");
    }
}


public class TestDog {

    public static void main(String[] args) {
        Dog dog = new Dog();

        if (dog != null) {
            dog.bark();
        }
    }
}
