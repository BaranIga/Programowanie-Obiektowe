//Napisz statyczną metodę, która sprawdza, czy dany napis jest palindromem. 
//Palindrom to słowo, fraza, liczba lub inny ciąg znaków, który czyta 
//się tak samo od przodu, jak i od tyłu. Stwórz przypadek testowy.


public class Main {

    public static Boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        String str2 = "";

        for (int i=str.length()-1; i>=0; i--) {
            str2 += str.charAt(i);
        }

        if (str.equals(str2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "ALA";
        String str2 = "KASIA";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str2));
    }
}
