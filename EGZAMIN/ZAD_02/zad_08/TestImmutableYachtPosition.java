package zad_08;

public class TestImmutableYachtPosition {
    public static void main(String[] args) {
        ImmutableYachtPosition position1 = new ImmutableYachtPosition(50.0, 10.0, 100.0);
        System.out.println("Original position: " + position1);

        ImmutableYachtPosition position2 = position1.move(1.0, 2.0, 3.0);

        System.out.println("New position after move: " + position2);
    }
}
