public class Main {
    public static <T extends Comparable<T>> T minValue(T[] tab) {
        if (tab.length > 0) {
            T min = tab[0];
            for (int i = 0; i < tab.length; i++) {
                if (min.compareTo(tab[i]) > 0) {
                    min = tab[i];
                }
            }
            return min;
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] tab = {4, 2, 1, 7};
        System.out.println(minValue(tab));

        String[] tab1 = {"Ala", "ma", "kota", "!", ":)"};
        System.out.println(minValue(tab1));

        Integer[] tab2 = {};
        System.out.println(minValue(tab2));
    }
}
