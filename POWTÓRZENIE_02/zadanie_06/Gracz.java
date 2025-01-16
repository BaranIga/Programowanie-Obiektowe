public class Gracz {
    private Bron sztylet;

    public Gracz(Bron sztylet) {
        this.sztylet = sztylet;
    }

    public void zaatakuj() {
        sztylet.uzyjBroni();
    }

    public static void main(String[] args) {
        Miecz miecz = new Miecz();
        Gracz gracz = new Gracz(miecz);
        gracz.zaatakuj();
        Łuk łuk = new Łuk();
        Gracz gracz1 = new Gracz(łuk);
        gracz1.zaatakuj();
    }
}
