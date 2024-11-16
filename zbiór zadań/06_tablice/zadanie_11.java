//Napisz program, który tworzy jednowymiarową tablicę 50 liczb całkowitych.
//Program powinien obliczać i wyświetlać ilość liczb, które są liczbami pierwszymi.


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[50];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100) + 1;
            System.out.print(tab[i] + " ");
        }

        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            if(isPrime(tab[i]) == true) {
                licznik++;
            }
        }

        System.out.println("\nIlość liczb pierwszych w tablicy: " + licznik);
    }

    public static boolean isPrime(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i=2; i * i <= liczba; i++) {
            if(liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}
