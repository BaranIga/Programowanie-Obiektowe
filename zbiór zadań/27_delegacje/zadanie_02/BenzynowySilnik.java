package delegacje_02;

public class BenzynowySilnik implements Silnik {
    @Override
    public void uruchom() {
        System.out.println("URUCHAMIAM");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("ZATRZYMUJE");
    }
}
