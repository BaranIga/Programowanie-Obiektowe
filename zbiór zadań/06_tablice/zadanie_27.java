//Napisz metodę printArray, która przyjmuje tablicę liczb całkowitych jako argument 
//i drukuje jej zawartość na konsoli. Wykorzystaj do tego metodę Arrays.toString() 
//z biblioteki java.util.Arrays, która zwraca tekstową reprezentację tablicy. 
//Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static void printArray(int[] tab) {
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {
        int[] tab = {2, 4, 5, 9, 7, 6, 4, 8, 4, 6};
        printArray(tab);
    }
}
