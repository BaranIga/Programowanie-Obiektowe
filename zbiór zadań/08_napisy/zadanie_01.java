//Napisz statyczną metodę, która przyjmuje napis jako argument i zwraca ten napis w
//odwrotnej kolejności. Stwórz przypadek testowy.


public class Main {

    public static String reversedString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String reversedString = "";

        for (int i=str.length()-1; i>=0; i--) {
            reversedString += str.charAt(i);
        }

        return reversedString;
    }

    public static void main(String[] args) {
        String str = "KOALA";

        System.out.println(reversedString(str));
    }
}
