package M12;

public class CheckingUtils {

    public static <T> boolean checkIfExists(T[] tab, T a) {
        if (tab == null || tab.length == 0){
            return false;
        }

        for (T elem : tab) {
            if (elem == a) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] tab = {2, 3, 4, 5, 6, 2};
        Integer[] tab1 = {2, 3, 4, 5, 5, 3};
        Integer[] tab2 = {1, 3, 4, 5, 6, 8};

        System.out.println(checkIfExists(tab, 2 ));
        System.out.println(checkIfExists(tab1, 2));
        System.out.println(checkIfExists(tab2, 2));
    }
}
