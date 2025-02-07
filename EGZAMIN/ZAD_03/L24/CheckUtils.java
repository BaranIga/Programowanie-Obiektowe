package L24;

public class CheckUtils {

    public static <T> boolean checkTypeCompatibility(T a, T b) {
        return a.getClass() == b.getClass();
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        Integer int1 = 12;

        System.out.println("Czy oba argumenty są tego samego typu? " + checkTypeCompatibility(str1, str2));
        System.out.println("Czy oba argumenty są tego samego typu? " + checkTypeCompatibility(str1, int1));
    }
}
