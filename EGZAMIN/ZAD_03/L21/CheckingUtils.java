package L21;

public class CheckingUtils {

    public static <T> boolean areArraysEqual(T[] tab1, T[] tab2) {
        if (tab1 == null || tab2 == null) {
            throw new IllegalArgumentException("Tablice nie mogą być null.");
        }

        if (tab1.length != tab2.length) {
            return false;
        }

        for (int i = 0; i < tab1.length; i++) {
            if (!tab1[i].equals(tab2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Integer[] array2 = {1, 2, 3};
        System.out.println("Czy tablice są równe? " + areArraysEqual(array1, array2));
    }
}
