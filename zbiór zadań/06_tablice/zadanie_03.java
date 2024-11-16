//Napisz program, który tworzy tablicę jednowymiarową 15 liczb całkowitych,
//a następnie oblicza i wyświetla największą i najmniejszą wartość w tablicy.


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[15];
        Random random = new Random();

        for(int i=0; i< tab.length; i++) {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }

        int min = tab[0];
        int max = tab[0];

        for(int i=0; i< tab.length; i++) {
            if(tab[i] > max) {
                max = tab[i];
            }
        }

        for(int i=0; i< tab.length; i++) {
            if(tab[i] < min) {
                min = tab[i];
            }
        }

        System.out.println("\nNajwiększa wartość: " + max);
        System.out.println("Najmnijesza wartość: " + min);
    }
}
