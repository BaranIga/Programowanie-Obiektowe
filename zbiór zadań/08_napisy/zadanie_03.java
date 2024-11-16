//Napisz statyczną metodę, która usuwa wszystkie spacje z danego napisu. Stwórz przypadek testowy.


public class Main {

    public static String trimMethod(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args) {
        String str = "H E L L O";
        System.out.println(str);
        System.out.println(trimMethod(str));
    }
}
