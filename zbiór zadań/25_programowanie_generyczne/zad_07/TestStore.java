package zad_07;

public class TestStore {
    public static void main(String[] args) {
        Storage<Integer> integerStorage = new Storage<>();
        integerStorage.store(45);
        System.out.println("Przechowywany Integer: " + integerStorage.retrieve());

        Storage<String> stringStorage = new Storage<>();
        stringStorage.store("Hello, World!");
        System.out.println("Przechowywany String: " + stringStorage.retrieve()); // Hello, World!

        Storage<Double> doubleStorage = new Storage<>();
        doubleStorage.store(3.14);
        System.out.println("Przechowywany Double: " + doubleStorage.retrieve()); // 3.14
    }
}
