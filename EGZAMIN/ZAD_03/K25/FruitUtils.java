package K25;

public class FruitUtils {

    public static <T extends Comparable<T>> boolean isSorted(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i].compareTo(tab[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Czy tablica jest posortowana? " + isSorted(tab));
    }
}
