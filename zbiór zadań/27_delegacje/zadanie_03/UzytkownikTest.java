package delegacje_03;

public class UzytkownikTest {
    public static void main(String[] args) {
        Powiadomienie emial = new Email();

        Użytkownik użytkownik = new Użytkownik(emial);

        użytkownik.powiadomOModernizacji("System będzie niedostępny od 2:00 do 4:00.");
    }
}
