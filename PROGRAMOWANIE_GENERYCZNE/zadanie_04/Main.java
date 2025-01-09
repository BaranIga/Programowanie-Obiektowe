public class Main {

    public static void main(String[] args) {
        Integer[] tab = {2, 3, 4, 5};
        printArray(tab);

        String[] tab2 = {"Ala", "ma", "kota."};
        printArray(tab2);
    }

    public static <T> void printArray(T[] tablica) {
        for (T ele : tablica) {
            System.out.println(ele);
        }
    }
}
