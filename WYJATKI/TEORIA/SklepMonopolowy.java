public class SklepMonopolowy {

    public void sprzedajCos() {
        checkAge(17);
    }

    public void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Niepełnoletni klient");
        }
    }

    public static void main(String[] args) {
        SklepMonopolowy sklepMonopolowy = new SklepMonopolowy();
        try {
            sklepMonopolowy.sprzedajCos();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
