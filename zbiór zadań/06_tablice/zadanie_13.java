//Napisz statyczną metodę minimumValue, która przyjmuje tablicę liczb całkowitych 
//jako argument i zwraca najmniejszą liczbę w tablicy. Przyjmij, że tablica zawsze 
//będzie miała co najmniej jeden element. Jeżeli tablica zawiera tylko jeden 
//element, zwróć ten element. Stwórz przypadek testowy.


public class Main {

    public static void main(String[] args) {
        int[] tab1 = {1, 5, 4, 8, 6, 0, 7};
        int[] tab2 = {5};
        int[] tab3 = {62, 45, 2, 14, 84, 76};

        System.out.println("Najmniejsza wartość tab1: " + minimumValue(tab1)); // Oczekiwane: 1
        System.out.println("Najmniejsza wartość tab2: " + minimumValue(tab2)); // Oczekiwane: 10
        System.out.println("Najmniejsza wartość tab3: " + minimumValue(tab3)); // Oczekiwane: -10

    }

    public static int minimumValue(int[] tab) {
        if(tab.length == 0) {
            return 0;
        }

        int min = tab[0];
        for (int i=1; i<tab.length; i++) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }

        return min;
    }
}
