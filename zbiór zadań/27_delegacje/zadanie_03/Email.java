package delegacje_03;

public class Email implements Powiadomienie {

    @Override
    public void wyślij(String wiadomość) {
        System.out.println("zostało wysłane: " + wiadomość);
    }
}
