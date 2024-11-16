//Utwórz program, który tworzy jednowymiarową tablicę 30 liczb całkowitych. 
//Następnie poproś użytkownika, aby podał dowolną liczbę. Program powinien 
//wyświetlić informację, czy podana liczba znajduje się w tablicy, a także ile 
//razy się w niej pojawia.


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[30];
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int number = scanner.nextInt();

        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(10) + 1;
        }

        int licznik = 0;
        for (int i=0; i<tab.length; i++) {
            if(tab[i] == number) {
                licznik ++;
            }
        }

        System.out.println("Liczba " + number + " występuje w tablicy " + licznik + " razy.");

        scanner.close();
    }
}
