//Utwórz program, który tworzy jednowymiarową tablicę 20 liczb losowych z przedziału od 
//1 do 100, a następnie oblicza i wyświetla ich średnią wartość.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[20];
        Random random = new Random(0);
        int suma = 0;

        for(int i=0; i< tab.length; i++) {
            tab[i] = random.nextInt(100) + 1;
            suma += tab[i];
        }

        int mean =  suma / tab.length;

        System.out.println(mean);
    }
}
