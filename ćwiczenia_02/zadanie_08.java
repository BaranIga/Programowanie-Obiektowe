/* Wprowadź napis i odwróć go */

public class zadanie_05 {

    public static String odwrocNapis(String napis) {
        StringBuilder odwrocony = new StringBuilder(napis);

        return odwrocony.reverse().toString();
    }
}


// W MAIN

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadż tekst do odwócenia: ");
        String wejscie = scanner.nextLine();

        System.out.println(zadanie_05.odwrocNapis(wejscie));
    }
}
