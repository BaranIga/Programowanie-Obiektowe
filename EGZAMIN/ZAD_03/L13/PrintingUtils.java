package L13;

import java.util.LinkedList;

public class PrintingUtils {

    public static <T> void printList(LinkedList<T> list) {
        for (T elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        printList(list);
    }
}
