package K15;

public class CheckingUtils {

    public static <T> void echoIfEquivalent(T a, T b, T c) {
        if (a.equals(b) && b.equals(c)) {
            System.out.println("Wszystkie trzy są równoważne");
        }
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hello";

        echoIfEquivalent(s1, s2, s3);
    }
}
