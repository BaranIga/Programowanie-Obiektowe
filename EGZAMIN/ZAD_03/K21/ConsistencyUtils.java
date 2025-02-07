package K21;

public class ConsistencyUtils {

    public static <T> boolean areBothNonNull(T a, T b) {
        return a != null && b != null;
    }

    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "KOT";

        System.out.println("Czy oba argumenty nie są null? " + areBothNonNull(s1, s2));
    }
}
