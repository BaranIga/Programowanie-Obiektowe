package teoria;

// Stwórz prostą klasę generyczną Box, która może
// przechowywać obiekt dowolnego typu. Klasa powinna
// zawierać metodę set,
// aby ustawić obiekt, oraz metodę get, aby go pobrać.

public class Box <T, U> {
    T value1;
    U value2;

    public Box(T value1, U value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public T getValue1() {
        return this.value1;
    }

    public U getValue2() {
        return this.value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Filemon");
        Animal animal2 = new Animal("Bonifacy");

        Box<Animal, Animal> box1 = new Box<>(animal, animal2);

        System.out.println(box1.getValue1().nazwa);
        box1.setValue2(animal2);
        System.out.println(box1.getValue1().nazwa);

        String napis = "hello";
        Box<String, Animal> box3Napis = new Box<>(napis, animal);
        System.out.println(box3Napis.getValue1());


        Box<Animal, String> box2 = new Box<>(animal, napis);
    }
}

// klasa generyczna = klasa, która może przechowywać obiekt dowolnego typu
