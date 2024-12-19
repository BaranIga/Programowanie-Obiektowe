public class Dog extends Animal implements LoudAnimal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hau hau");
    }

    @Override
    public void sayName() {
        System.out.println(this.name);
    }
}
