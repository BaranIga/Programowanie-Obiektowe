public class Biuro {
    private Printer printer;

    public Biuro(Printer printer) {
        this.printer = printer;
    }

    public void drukujDokument(String tekst) {
        if (printer != null) {
            printer.drukuj(tekst);
        }
        System.out.println("Brak drukarki");
    }
}
