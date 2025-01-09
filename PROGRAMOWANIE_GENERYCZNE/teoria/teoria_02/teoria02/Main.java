package teoria02;

public class Main {
    public static void main(String[] args) {
        Muzeum muzeum = new Muzeum();
        Koncert koncert = new Koncert();

        Kierownik kierownik = new Kierownik(muzeum);
        kierownik.zalatwBilet();
        kierownik.setBiletomat(koncert);
        Kierownik kierownik1 = new Kierownik(koncert);
        kierownik1.zalatwBilet();


    }
}
