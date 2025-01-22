package zad_06;

public interface Stack<T> {
    void push(T item);

    T pop();

    T peek();

    boolean isEmpty();
}
