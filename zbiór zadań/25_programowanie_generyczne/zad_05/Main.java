package zad_05;

public class Main {

    public static <T extends Comparable<T>> T max(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być pusta.");
        }

        T maxElement = tab[0];

        for (int i = 1; i < tab.length; i++) {
            if (tab[i].compareTo(maxElement) > 0) {
                maxElement = tab[i];
            }
        }

        return maxElement;
    }


    public static void main(String[] args) {
        Integer[] integers = {10, 20, 30, 40, 25};
        System.out.println("Największa liczba: " + max(integers));

        Double[] doubles = {10.5, 20.3, 15.7, 30.8};
        System.out.println("Największa liczba zmiennoprzecinkowa: " + max(doubles));

        String[] strings = {"apple", "banana", "kiwi", "orange"};
        System.out.println("Największy string: " + max(strings));

        try {
            Integer[] emptyArray = {};
            System.out.println("Największy element: " + max(emptyArray));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
