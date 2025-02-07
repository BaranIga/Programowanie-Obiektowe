package K32;

public class VehicleUtils {

    public static <T extends Comparable<T>> boolean isDescending(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i].compareTo(tab[i + 1]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] numbers1 = {1, 2, 3, 4, 5};
        Integer[] numbers2 = {5, 4, 3, 2, 1};

        System.out.println(isDescending(numbers1));
        System.out.println(isDescending(numbers2));
    }
}
