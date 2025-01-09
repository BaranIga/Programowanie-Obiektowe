package teoria02;

public class Kierownik {

    private Biletomat biletomat;

    public Kierownik(Biletomat biletomat) {
        this.biletomat = biletomat;
    }

    public void zalatwBilet() {
        biletomat.wystawBilet();
    }

    public void setBiletomat(Biletomat biletomat) {
        this.biletomat = biletomat;
    }
}
