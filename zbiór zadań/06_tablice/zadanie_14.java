//Napisz statyczną metodę average, która przyjmuje tablicę liczb zmiennoprzecinkowych
//jako argument i zwraca średnią arytmetyczną wszystkich liczb w tablicy. Jeżeli tablica
//jest pusta, zwróć 0. Stwórz przypadek testowy.


public class Main {

    public static double average(double[] tab) {
        if (tab.length == 0) {
            return 0.0;
        }

        double sum = 0.0;

        for (int i=0; i< tab.length; i++) {
            sum += tab[i];
        }

        return sum / tab.length;
    }

    public static void main(String[] args) {
        double[] tab1 = {2.5, 4.8, 4.6, 9.1, 5.1};
        double[] tab2 = {};
        double[] tab3 = {10.0};
        double[] tab4 = {-5.0, -10.0, -15.0};

        System.out.println("Srednia tab1: " + average(tab1));
        System.out.println("Srednia tab2: " + average(tab2));
        System.out.println("Srednia tab3: " + average(tab3));
        System.out.println("Srednia tab4: " + average(tab4));

    }
}
