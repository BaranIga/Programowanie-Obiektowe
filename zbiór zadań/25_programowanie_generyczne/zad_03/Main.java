package zad_03;

public class Main {
    public static void main(String[] args) {
        String napis1 = "hi";
        String napis2 = "cat";
        String napis3 = "dog";

        Counter<String> counter = new Counter<>();
        counter.add(napis1);
        System.out.println(counter.count);
        counter.add(napis2);
        System.out.println(counter.count);
        counter.add(napis3);
        System.out.println(counter.count);
    }
}
