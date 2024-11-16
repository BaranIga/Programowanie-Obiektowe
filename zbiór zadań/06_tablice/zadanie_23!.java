//Napisz statyczną metodę mergeArrays, która przyjmuje dwie tablice liczb całkowitych 
//jako argumenty. Funkcja powinna zwrócić nową tablicę, która jest połączeniem obu 
//pierwotnych tablic. Na przykład, dla tablic [1, 2, 3] i [4, 5, 6], funkcja powinna 
//zwrócić [1, 2, 3, 4, 5, 6]. Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static int[] mergeArrays(int[] tab1, int[] tab2) {
        int[] tab3 = new int[tab1.length + tab2.length];

        System.arraycopy(tab1, 0, tab3, 0, tab1.length);

        System.arraycopy(tab2, 0, tab3, tab1.length, tab2.length);

        return tab3;
    }

    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = {4, 5, 6};

        System.out.println("Tablica 1: " + Arrays.toString(tab1));
        System.out.println("Tablica 2: " + Arrays.toString(tab2));

        int[] mergeTab = mergeArrays(tab1, tab2);

        System.out.println("Połączona tablica: " + Arrays.toString(mergeTab));
    }
}
