// Napisz program, który tworzy listę tablicową 10 liczb
// całkowitych, a następnie wyświetla je w konsoli w porządku
// odwrotnym do wprowadzenia.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> listaLiczbCalkowitych = new ArrayList<>();
        listaLiczbCalkowitych.add(3);
        listaLiczbCalkowitych.add(4);
        listaLiczbCalkowitych.add(5);
        listaLiczbCalkowitych.add(6);
        listaLiczbCalkowitych.add(7);
        listaLiczbCalkowitych.add(8);
        listaLiczbCalkowitych.add(9);
        listaLiczbCalkowitych.add(10);
        listaLiczbCalkowitych.add(11);
        listaLiczbCalkowitych.add(12);

        /* for (Integer liczbCalkowitych : listaLiczbCalkowitych) {
            System.out.println(liczbCalkowitych);
        } */

        for (int i = listaLiczbCalkowitych.size() - 1; i >= 0; i--) {
            System.out.print(listaLiczbCalkowitych.get(i) + " ");
        }

        System.out.println(listaLiczbCalkowitych.reversed());
        
        /* for (Integer element : listaLiczbCalkowitych.reversed()) {
            System.out.println(element);
        } */ 
    }
}
