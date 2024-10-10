/* Napisz statyczną metodę countZeros, która przyjmuje listę
tablicową liczb całkowitych jako argument i zwraca liczbę
wystąpień zera w liście tablicowej. Na przykład, dla
[0, 1, 2, 0, 3, 0, 4], funkcja powinna zwrócić 3. Stwórz przypadek testowy.
 */

import java.util.ArrayList;

public class zadanie_04 {

    public static int countZeros(ArrayList<Integer> lista) {
        int count = 0;

        for(int i=0; i < lista.size(); i++){
            if(lista.get(i) == 0){
                count++;
            }
        }
        return count;
    }
}


// W MAIN

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            liczby.add(i);
        }

        System.out.println(zadanie_04.countZeros(liczby));
    }
}
