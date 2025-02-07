package zad_06;

public class TestKitchen {
    public static void main(String[] args) {
        Stove stove1 = new Stove(4, "Samsung", "SN12345");

        Kitchen kitchen1 = new Kitchen("My Kitchen", stove1);

        try {
            Kitchen kitchen2 = kitchen1.clone();
            System.out.println(kitchen1);
            System.out.println(kitchen2);
        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }
    }
}
