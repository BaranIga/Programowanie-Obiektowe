package K12;

import java.util.HashSet;

public class CheckingUtils {

    public static <E> boolean checkDisjoint(HashSet<E> set1, HashSet<E> set2) {
        for (E elem : set1) {
            if (set2.contains(elem)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        HashSet<Integer> set3 = new HashSet<>();
        set3.add(3);
        set3.add(6);
        set3.add(9);

        System.out.println("Set1 and Set2 disjoint: " + checkDisjoint(set1, set2));
        System.out.println("Set1 and Set3 disjoint: " + checkDisjoint(set1, set3));
    }
}
