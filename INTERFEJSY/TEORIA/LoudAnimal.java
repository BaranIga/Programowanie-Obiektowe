// INTERFEJS

public interface LoudAnimal {
    // int counter = 0;  // to oznacza ze ta zmienna jest automatycznie statyczna i finall = dla wsyztskeigo z klasy jest takie samo i  nie mozna jej zmienic (bo finall)

    void makeNoise();

    default void sayName() {
        System.out.println("I don't know my name");
    }

}
