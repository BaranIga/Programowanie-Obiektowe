package K23;

public class RelationcheckUtils {

    public static <T> boolean isExactlyOneNull(T a, T b) {
        return (a == null && b != null) || (a != null && b == null);
    }

    public static void main(String[] args) {
        Integer a = null;
        Integer b = 4;

        System.out.println("Czy dokładnie jeden z argumentów jest null? " + isExactlyOneNull(a, b));
    }
}
