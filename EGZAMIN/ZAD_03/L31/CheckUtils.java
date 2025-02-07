package L31;

public class CheckUtils {

    public static <T extends Comparable<T>> int checkOrder(T a, T b) {
        if (a.compareTo(b) < 0) {
            return -2;
        } else if (a.compareTo(b) > 0) {
            return 2;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Integer num1 = 5;
        Integer num2 = 10;
        System.out.println("Wynik porównania: " + checkOrder(num1, num2));
    }
}
