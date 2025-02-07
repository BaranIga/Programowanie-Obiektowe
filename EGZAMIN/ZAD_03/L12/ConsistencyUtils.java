package L12;

public class ConsistencyUtils {

    public static <T> boolean areBothNonNull(T a, T b) {
        return a != null & b != null;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;
        System.out.println("Czy któryś z argumentów jest null? " + areBothNonNull(str1, str2));
    }
}
