public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        System.out.println(stringBox.get());

        Box<Integer> integerBox = new Box<>();
        integerBox.set(12400);
        System.out.println(integerBox.get());
    }
}
