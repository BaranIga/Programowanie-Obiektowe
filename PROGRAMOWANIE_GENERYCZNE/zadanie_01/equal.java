public class equal {

    public static <T> boolean isEqual(T value1, T value2) {
        return value1.equals(value2);
    }

    public static void main(String[] args) {
        System.out.println(isEqual(5, 10));
        System.out.println(isEqual(10, 10));
        System.out.println(isEqual("Helo", "Helo"));
        System.out.println(isEqual("Helo", "Hello"));
        System.out.println(isEqual(5.12, 10.20));
    }
}
