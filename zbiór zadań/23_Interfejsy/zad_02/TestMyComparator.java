package zad_02;

public class TestMyComparator implements MyComparator{
    @Override
    public int compare(int a, int b) {
        if (a < b) {
            return -1;
        } else if (a == b) {
            return 0;
        } else {
            return 1;
        }
    }
}
