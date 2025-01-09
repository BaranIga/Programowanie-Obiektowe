public class Triple <T, U, V> {

    T value1;
    U value2;
    V value3;

    public Triple(T value1, U value2, V value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public T getFirst() {
        return this.value1;
    }

    public U getSecond() {
        return this.value2;
    }

    public V getThird() {
        return this.value3;
    }
}
