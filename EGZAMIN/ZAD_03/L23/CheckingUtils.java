package L23;

public class CheckingUtils {

    public static <T extends Comparable<T>> T findMaxElement(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Tablice nie mogą być pusta.");
        }

        T max = tab[0];
        for (T element : tab) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] numbers = {2, 1, 8, 2, 4, 6, 17, 2, 8};
        System.out.println(findMaxElement(numbers));

    }
}
