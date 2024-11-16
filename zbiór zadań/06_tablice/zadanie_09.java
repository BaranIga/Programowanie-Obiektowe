//Napisz program, który tworzy jednowymiarową tablicę 20 liczb całkowitych, 
//a następnie oblicza i wyświetla ilość liczb parzystych i nieparzystych w tablicy.


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[20];
        Random random = new Random();

        for (int i=0; i< tab.length; i++) {
            tab[i] = random.nextInt(50) + 1;
            System.out.print(tab[i] + " ");
        }

        int liczbaPatrzystych = 0;
        int liczbaNieparzystych = 0;

        for (int i=0; i< tab.length; i++) {
            if(tab[i] % 2 == 0) {
                liczbaPatrzystych += 1;
            }
            else {
                liczbaNieparzystych += 1;
            }
        }

        System.out.println("\nIlość liczb parzystych w tablicy: " + liczbaPatrzystych);
        System.out.println("Ilość liczb nieparzyste w tablicy: " + liczbaNieparzystych);
    }
}
