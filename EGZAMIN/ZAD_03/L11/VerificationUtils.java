package L11;

public class VerificationUtils {

    public static <T> boolean isEitherNull(T a, T b) {
        return a == null || b == null;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = null;
        System.out.println("Czy któryś z argumentów jest null? " + isEitherNull(str1, str2));
    }
}