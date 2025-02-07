package K35;

public class ComparisonsUtils {

    public static <T> boolean areAllDifferent(T a, T b, T c) {
        if (!a.equals(b) && !b.equals(c) && !a.equals(c)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer number = 1;
        Integer number1 = 2;
        Integer number2 = 3;

        System.out.println(areAllDifferent(number, number1, number2));
    }
}
