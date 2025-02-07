package K33;

import java.util.Collection;
import java.util.Iterator;

public class MatUtils {

    public static <T extends Comparable<T>> boolean isMonotonicallyIncreasing(Collection<T> collection) {
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Collection cannot be null or empty");
        }

        Iterator<T> iterator = collection.iterator();
        T previous = iterator.next();

        while (iterator.hasNext()) {
            T current = iterator.next();
            if (previous.compareTo(current) > 0) {
                return false;
            }
            previous = current;
        }

        return true;
    }
}
