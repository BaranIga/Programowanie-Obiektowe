//Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis z
//zamienioną pierwszą i ostatnią literą. Stwórz przypadek testowy.


public class Main {

    public static String changeFirstAndLast(String str) {
        char firstLetter = str.charAt(0);
        char lastLetter = str.charAt(str.length() - 1);
        String middleLetters = str.substring(1, str.length() - 2);

        return lastLetter + middleLetters + firstLetter;
    }

    public static void main(String[] args) {
        String str = "Vampire Diaries";
        System.out.println(changeFirstAndLast(str));
    }
}
