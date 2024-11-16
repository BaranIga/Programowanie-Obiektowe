//Napisz statyczną metodę copyArrayWithIndex, która przyjmuje tablicę liczb całkowitych 
//oraz indeks początkowy i końcowy jako argumenty. Funkcja powinna zwrócić nową tablicę 
//zawierającą elementy pierwotnej tablicy od indeksu początkowego do końcowego (włącznie).
//Na przykład, dla tablicy [1, 2, 3, 4, 5] i indeksów 1 i 3, funkcja powinna zwrócić 
//[2, 3, 4]. Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static int[] copyArrayWithIndex(int[] tab, int startIndex, int endIndex) {
        return Arrays.copyOfRange(tab, startIndex, endIndex + 1);
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        int startIndex = 1;
        int endIndex = 3;

        int[] wynik = copyArrayWithIndex(tab, startIndex, endIndex);
        System.out.println(Arrays.toString(wynik));
    }
}
