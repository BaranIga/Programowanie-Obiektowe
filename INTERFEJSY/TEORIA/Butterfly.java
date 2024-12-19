import java.util.ArrayList;

public class Butterfly extends Animal {

    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        // one
        ArrayList<LoudAnimal> animals1 = new ArrayList<>();
        animals1.add(new Cat("Filemon"));
        animals1.add(new Dog("Burek"));
        // (nie działa wtedy) animals.add(new Butterfly("Cytrynek"));

        for (LoudAnimal a: animals1) {
            a.makeNoise();
        }


        // two
        ArrayList<Animal> animals2 = new ArrayList<>();
        animals2.add(new Cat("Filemon"));
        animals2.add(new Dog("Burek"));
        animals2.add(new Butterfly("Cytrynek"));

        for (Animal a: animals2) {
            if (a instanceof LoudAnimal) {
                ((LoudAnimal) a).makeNoise();
            }
        }

        for (Animal a: animals2) {
            if (a instanceof LoudAnimal) {
                ((LoudAnimal) a).sayName();
            }
        }
    }
}
