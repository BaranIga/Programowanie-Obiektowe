package L25;

public class ValidationUtils {

    public static <T> boolean isAnyMatch(T a, T b, T c) {
        return a.equals(b) || b.equals(c) || a.equals(c);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println("Czy co najmniej dwa argumenty są równe? " + isAnyMatch(str1, str2, str3));
    }
}
