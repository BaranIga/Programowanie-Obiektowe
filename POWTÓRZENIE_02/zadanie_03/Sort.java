import java.util.Arrays;

public class Sort {

    public static <T extends Comparable<T>> T sortAndReturnFirst(T[] tab) throws EmptyArrayException {
        if (tab.length == 0 || tab == null) {
            throw new EmptyArrayException("tablica nie może być pusta");
        }

        Arrays.sort(tab);  // rosnące domyślnie chyba

        return tab[0];
    }
}
