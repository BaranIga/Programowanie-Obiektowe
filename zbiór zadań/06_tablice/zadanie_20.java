//Napisz statyczną metodę copyArrayReverse, która przyjmuje tablicę liczb całkowitych 
//jako argument i zwraca nową tablicę, która jest odwróconą kopią pierwotnej. 
//Na przykład, dla tablicy [1, 2, 3, 4, 5], funkcja powinna zwrócić [5, 4, 3, 2, 1]. 
//Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static int[] copyArrayReverse(int[] tab) {
        int[] copiedTab = new int[tab.length];
        int index = 0;

        for (int i=tab.length - 1; i>=0; i--) {
            copiedTab[index++] = tab[i];
        }

        return copiedTab;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(copyArrayReverse(tab)));
    }
}
