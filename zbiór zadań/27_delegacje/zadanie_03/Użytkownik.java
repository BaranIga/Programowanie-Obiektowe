package delegacje_03;

public class Użytkownik {
    Powiadomienie powiadomienie;

    public Użytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }

    public void powiadomOModernizacji(String informacja) {
        powiadomienie.wyślij(informacja);
    }
}
