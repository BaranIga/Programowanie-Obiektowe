package L15;

public class RelationcheckUtils {

    public static <T> boolean isExactlyOneNull(T a, T b) {
        return (a == null && b != null) || (a != null && b == null);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;
        String str3 = null;

        System.out.println("Czy dokładnie jeden z argumentów jest null? " + isExactlyOneNull(str1, str2));
        System.out.println("Czy dokładnie jeden z argumentów jest null? " + isExactlyOneNull(str2, str3));    }
}
