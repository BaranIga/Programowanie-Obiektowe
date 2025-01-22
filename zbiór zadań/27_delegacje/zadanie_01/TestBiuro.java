public class TestBiuro {
    public static void main(String[] args) {
        Printer standardowyPrinter = new StandardowyPrinter();

        Biuro biuro = new Biuro(standardowyPrinter);

        System.out.println("Test drukowania dokumentu:");
        biuro.drukujDokument("To jest dokument do wydrukowania.");
    }
}
