package zad_08;

public class PrintArray {

    public static <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        String[] stringsArray = {"Hello", "World", "Java", "Generics"};
        printArray(stringsArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        printArray(doubleArray);

        Character[] charArray = {'A', 'B', 'C', 'D'};
        printArray(charArray);
    }
}
