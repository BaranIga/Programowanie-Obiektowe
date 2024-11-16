//Napisz metodę copyArray, która przyjmuje tablicę liczb wymiernych jako argument. 
//Metoda powinna zwracać nową tablicę, będącą kopią przekazanej tablicy. Do skopiowania 
//tablicy wykorzystaj metodę Arrays.copyOf() z biblioteki java.util.Arrays. Stwórz 
//przypadek testowy.

import java.util.Arrays;

public class Main {

    public static void copyArray(float[] tab) {
        float[] copiedTab = Arrays.copyOf(tab, tab.length);
        System.out.println(Arrays.toString(copiedTab));
    }

    public static void main(String[] args) {
        float[] tab = {1, 5, 3, 1 ,5 ,9 ,15 ,4, 74, 5, 41, 2};
        copyArray(tab);
    }
}
