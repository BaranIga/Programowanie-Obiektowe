//Napisz program, który tworzy tablicę jednowymiarową 10 liczb całkowitych,
//a następnie wyświetla je w konsoli w porządku odwrotnym do wprowadzenia.

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i=0; i<tab.length; i++) {
            tab[i] = i;
        }

        for(int i= tab.length - 1; i>=0; i--) {
            System.out.print(tab[i] + " ");
        }
    }
}
