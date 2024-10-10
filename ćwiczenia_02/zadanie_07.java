/* Napisz statyczną metodę, która przyjmuje napis jako argument i
zwraca ten napis z zamienioną pierwszą i ostatnią literą. Stwórz
przypadek testowy.
 */

public class zadanie_07 {
    public static String zamiana(String napis) {
        if(napis == null || napis.length() < 2) {
            return napis;
        }

        char znakPierwszy = napis.charAt(0);
        char znakOstatni = napis.charAt(napis.length() -1);

        String srodek = napis.substring(1, napis.length() -1);
        return znakOstatni + srodek + znakPierwszy;
    }
}


// drugi sposób 

public static String zamiana_01(String napis){
        StringBuilder str = new StringBuilder(napis);
        str.setCharAt(0, napis.charAt(napis.length() -1));
        str.setCharAt(str.length() - 1, napis.charAt(0));
        
        return str.toString();
    }


// W MAIN

public class Main {
    public static void main(String[] args) {

        System.out.println(zadanie_07.zamiana("Siema"));
        System.out.println(zadanie_07.zamiana_01("Siema"));
    }
}
