package zad_04;

public class Triple<T, U, V> {
    T value1;
    U value2;
    V value3;

    public Triple(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getFirst() {
        return value1;
    }

    public U getSecond() {
        return value2;
    }

    public V getThird() {
        return value3;
    }


    public static void main(String[] args) {
        Triple<String, Integer, String> triple = new Triple<>("Cat", 15, "Dog");

        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());
    }
}
