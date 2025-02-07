package L35;

public class CheckingUtils {
    public static <T> int countOccurrences(T[] tab, T element) {
        if (tab == null || element == null) {
            throw new IllegalArgumentException("Tablica i element nie mogą być null.");
        }

        int count = 0;

        for (T e : tab) {
            if (e.equals(element)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 2, 4, 2};
        Integer target = 2;
        System.out.println("Liczba wystąpień: " + countOccurrences(numbers, target));
    }
}
