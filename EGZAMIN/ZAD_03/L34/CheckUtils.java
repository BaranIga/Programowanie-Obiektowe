package L34;

public class CheckUtils {

    public static <T extends Comparable<T>> T maxOfTwo(T a, T b) {
        if (a == null || b == null) {
            throw new NullPointerException("Żaden z argumentów nie może być null.");
        }

        return a.compareTo(b) > 0 ? a : b;
    }

    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 10;
        System.out.println("Większy element: " + maxOfTwo(num1, num2));
    }
}
