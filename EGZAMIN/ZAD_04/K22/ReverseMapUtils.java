package K22;

import java.util.*;

public class ReverseMapUtils {

    public static <K, V> TreeMap<V, K> reverseMap(TreeMap<K, V> map) {
        TreeMap<V, K> reversedMap = new TreeMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            reversedMap.put(entry.getValue(), entry.getKey());
        }
        return reversedMap;
    }

    public static void main(String[] args) {
        TreeMap<Integer, String> originalMap = new TreeMap<>();
        originalMap.put(1, "A");
        originalMap.put(2, "B");
        originalMap.put(3, "C");

        TreeMap<String, Integer> reversedMap = reverseMap(originalMap);

        System.out.println("Original Map: " + originalMap);
        System.out.println("Reversed Map: " + reversedMap);
    }
}
