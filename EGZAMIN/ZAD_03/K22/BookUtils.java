package K22;

public class BookUtils {

    public static <T extends Comparable<T>> T mostFrequentValue(T[] tab) {
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int maxCount = 0;
        T mostFrequent = null;

        for (int i = 0; i < tab.length; i++) {
            int count = 1;
            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i].equals(tab[j])) {
                    count++;
                }
            }
            if (count >= maxCount) {
                maxCount = count;
                mostFrequent = tab[i];
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        Integer[] tab = {2, 2, 3, 5, 3, 4, 6, 5, 4, 3, 2, 3, 4, 2, 3};
        System.out.println(mostFrequentValue(tab));
    }
}
