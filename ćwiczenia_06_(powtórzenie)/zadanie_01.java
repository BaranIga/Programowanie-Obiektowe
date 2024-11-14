// Napisz statyczną metodę oddElementsSum, która
// przyjmuje listę tablicową liczb całkowitych jako
// argument i zwraca sumę wszystkich nieparzystych liczb
// w liście tablicowej. Jeżeli w liście tablicowej nie
// ma żadnych nieparzystych liczb, funkcja powinna
// zwrócić 0. Stwórz przypadek testowy.


import java.util.ArrayList;

public class Main {

    public static int oddElementsSum(ArrayList<Integer> tab) {
        int sum = 0;

        for(int i=0; i<tab.size(); i++) {
            if(tab.get(i) % 2 != 0) {
                sum += tab.get(i);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> tablica = new ArrayList<Integer>();

        for(int i=0; i<5; i++) {
            tablica.add(i+2);
        }

        int wynik = oddElementsSum(tablica);

        System.out.println(wynik);
    }
}
