package zad_02;

public class Main {
    public static void main(String[] args) {
        MyComparator comparator = new TestMyComparator();

        System.out.println(comparator.compare(5, 10));
        System.out.println(comparator.compare(10, 10));
        System.out.println(comparator.compare(15, 10));
    }
}
