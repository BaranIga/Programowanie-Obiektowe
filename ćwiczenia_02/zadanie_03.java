/* Napisz statyczną metodę average, która przyjmuje listę
tablicową liczb zmiennoprzecinkowych jako argument i zwraca
średnią arytmetyczną wszystkich liczb. Jeżeli lista tablicowa
jest pusta, zwróć 0. Stwórz przypadek testowy.
 */

import java.util.ArrayList;

public class zadanie_03 {

    public static Double average(ArrayList<Double> lista) {
        Double temp = 0.0;

        for(int i = 0; i < lista.size(); i++){
            temp += lista.get(i);
        }

        return temp/ lista.size();
    }
}


// W MAIN

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> liczby = new ArrayList<Double>();
        for (int i = 0; i < 15; i++) {
            liczby.add((double) i);
        }

        System.out.println(zadanie_03.average(liczby));
    }
}
