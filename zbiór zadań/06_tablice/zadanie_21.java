//Napisz statyczną metodę copyArrayEven, która przyjmuje tablicę liczb całkowitych jako
//argument i zwraca nową tablicę zawierającą tylko parzyste liczby z pierwotnej tablicy.
//Na przykład, dla tablicy [1, 2, 3, 4, 5], funkcja powinna zwrócić [2, 4]. 
//Jeżeli w tablicy nie ma żadnych parzystych liczb, funkcja powinna zwrócić pustą tablicę.
//Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static int[] copyArrayEven(int[] tab) {
        int count = 0;
        for (int i=0; i<tab.length; i++) {
            if(tab[i] % 2 == 0) {
                count++;
            }
        }

        int[] tab2 = new int[count];
        int index = 0;

        for (int i=0; i<tab.length; i++) {
            if(tab[i] % 2 == 0) {
                tab2[index++] = tab[i];
            }
        }

        return tab2;
    }

    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3, 4, 5};
        int[] tab2 = {};

        System.out.println(Arrays.toString(copyArrayEven(tab1)));
        System.out.println(Arrays.toString(copyArrayEven(tab2)));
    }
}
