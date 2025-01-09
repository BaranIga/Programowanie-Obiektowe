public class Main {
    public static void main(String[] args) {
        Triple<String, Integer, String> triple = new Triple<>("Cat", 15, "Dog");

        System.out.println(triple.getFirst());
        System.out.println(triple.getSecond());
        System.out.println(triple.getThird());

    }
}
