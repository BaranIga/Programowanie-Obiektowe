package delegacje_02;

public class TestSamochod {
    public static void main(String[] args) {
        Silnik benzynowySilnik = new BenzynowySilnik();

        Samochod samochod = new Samochod(benzynowySilnik);

        samochod.start();
        samochod.stop();
    }
}
