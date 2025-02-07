package L22;

public class CheckSequenceUtils {

    public static <T extends Comparable<T>> boolean checkSequence(T a, T b, T c) {
        return (a.compareTo(b) <= 0 && b.compareTo(c) <= 0) || (a.compareTo(b) >= 0 && b.compareTo(c) >= 0);
    }

    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 13;
        Integer c = 15;

        System.out.println(checkSequence(a, b, c));

        System.out.println(checkSequence(a, c, b));

        System.out.println(checkSequence(c, b, a));
    }
}
