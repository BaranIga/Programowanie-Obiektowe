import java.util.Arrays;

public class Main {

    public static int[] copyArray(int[] tab) {
        int[] copiedTab = new int[tab.length];

        int index = 0;

        for (int i=0; i<tab.length; i++) {
            copiedTab[index++] = tab[i];
        }

        return copiedTab;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(copyArray(tab)));
    }
}
