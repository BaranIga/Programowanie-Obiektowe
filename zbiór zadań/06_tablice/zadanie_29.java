//Napisz metodę sortArray, która przyjmuje tablicę liczb wymiernych jako argument. 
//Metoda powinna sortować tablicę w porządku rosnącym, wykorzystując do tego metodę 
//Arrays.sort() z biblioteki java.util.Arrays. Stwórz przypadek testowy.


import java.util.Arrays;

public class Main {

    public static void sortArray(double[] tab) {
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }

    public static void main(String[] args) {
        double[] tab = {1, 5, 3, 1 ,5 ,9 ,15 ,4, 74, 5, 41, 2};
        sortArray(tab);
    }
}
