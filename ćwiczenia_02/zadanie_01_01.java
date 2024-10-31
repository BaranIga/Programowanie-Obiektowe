// na tablicę jednowymiarową

// Napisz program, który tworzy listę tablicową 10 liczb całkowitych,
// a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.

package zad_01;

public class Main {
    public static void main(String[] args) {
        int[] mojaTablica;
        mojaTablica = new int[10];

        for (int i=0; i<10; i++) {
            mojaTablica[i] = i;
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(mojaTablica[i]);
        }
    }
}
