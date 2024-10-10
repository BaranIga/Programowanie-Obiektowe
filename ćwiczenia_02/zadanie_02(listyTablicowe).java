/* Napisz statyczną metodę minimumValue, która przyjmuje
listę tablicową liczb całkowitych jako argument i zwraca
najmniejszą liczbę w liście tablicowej. Przyjmij, że lista
tablicowa zawsze będzie miała co najmniej jeden element.
Stwórz przypadek testowy.
 */


import java.util.ArrayList;

public class zad_02 {

    public static int minimumValue(ArrayList<Integer> lista) {
        int minimum = lista.getFirst();
        for(int i = 1; i < lista.size(); i++) {
            if(lista.get(i) < minimum) {
                minimum = lista.get(i);
            }
        }
        return minimum;
    }
}




// W MAIN

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            liczby.add(i);
        }

        System.out.println(zad_02.minimumValue(liczby));
    }
}
