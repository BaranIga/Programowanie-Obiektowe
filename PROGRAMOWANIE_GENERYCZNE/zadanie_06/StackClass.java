package zad_06;

import java.util.ArrayList;

public class StackClass<T> implements Stack<T> {

    private ArrayList<T> elements;

    public StackClass() {
        elements = new ArrayList<>();
    }

    @Override
    public void push(T item) {
        elements.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stos jest pusty.");
        }
        return elements.remove(elements.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stos jest pusty.");
        }
        return elements.get(elements.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }
}
