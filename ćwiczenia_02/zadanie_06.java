/* Używając metody charAt, napisz statyczną metodę,
która sprawdza, czy dany napis zaczyna się i kończy tym
samym znakiem. Stwórz przypadek testowy.
 */

public class zadanie_06 {

    public static boolean czyPierwszyToOstatni(String napis) {
        if(napis.charAt(0) == napis.charAt(napis.length()-1)) {
            return true;
        }
        return false;
    }
}


// W MAIN

public class Main {
    public static void main(String[] args) {

        System.out.println(zadanie_06.czyPierwszyToOstatni("Siema"));
    }
}


// mozna jeszcze to napis.toLowerCase
