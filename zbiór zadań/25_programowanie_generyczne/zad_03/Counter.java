package zad_03;

import java.util.ArrayList;

public class Counter<T> {

    int count;
    ArrayList<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
