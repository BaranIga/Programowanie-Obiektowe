package K11;

public class MotoUtils {

    public static <T extends Comparable<T>> T lastMaxValue(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Tablica nie może być null ani pusta.");
        }

        T max = tab[0];
        for (T element : tab) {
            if (element.compareTo(max) >= 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 7, 5, 7};
        System.out.println("\"Ostatni największy element: " + lastMaxValue(numbers));

        Double[] numbersDouble = {4.2, 8.2, 9.1, 1.1, 3.9};
        System.out.println("\"Ostatni największy element: " + lastMaxValue(numbersDouble));
    }
}
