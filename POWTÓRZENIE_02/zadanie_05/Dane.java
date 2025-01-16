class NiepoprawnyFormatDanychException extends Exception {
    public NiepoprawnyFormatDanychException(String message) {
        super(message);
    }
}

public class Dane {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if (!(dane.contains("@"))) {
            throw new NiepoprawnyFormatDanychException("To nie jest adres email.");
        }
    }

    public static void main(String[] args) {
        try {
             sprawdzFormatDanych("haha");

        } catch(NiepoprawnyFormatDanychException e) {
            System.out.println(e.getMessage());
        }
    }
}
