package K24;

public class VerificationUtils {

    public static <T> void displayIfDistinct(T a, T b, T c) {
        if (!a.equals(b) || !b.equals(c) || !a.equals(c)) {
            System.out.println("Wszystkie trzy są różne");
        }
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        displayIfDistinct(str1, str2, str3);
    }
}
