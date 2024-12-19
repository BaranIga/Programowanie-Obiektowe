public class Cat extends Animal implements LoudAnimal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau");
    }

    @Override
    public void sayName() {
        System.out.println(this.name);
    }
}


