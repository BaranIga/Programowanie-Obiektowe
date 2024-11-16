//Utwórz program, który tworzy jednowymiarową tablicę 30 liczb całkowitych. Następnie 
//program powinien obliczyć i wyświetlić ilość liczb, które są kwadratami innej liczby całkowitej.


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[30];
        Random random = new Random();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(50) + 1;
            System.out.print(tab[i] + " ");
        }

        int licznik = 0;
        for (int i = 0; i < tab.length; i++) {
            int pierwiastek = (int) Math.sqrt(tab[i]);
            if (pierwiastek * pierwiastek == tab[i]) {
                licznik++;
            }
        }

        System.out.println("\nIlość liczb będących kwadratami innej liczby: " + licznik);
    }
}
