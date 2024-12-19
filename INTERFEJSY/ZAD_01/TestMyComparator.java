public class TestMyComparator implements MyComparator {

    @Override
    public int compare(int a, int b) {
        if (a > b) {
            return -1;
        }
        else if (a == b) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        TestMyComparator testMyComparator = new TestMyComparator();

        System.out.println(testMyComparator.compare(5, 10));
        System.out.println(testMyComparator.compare(5, 5));
        System.out.println(testMyComparator.compare(10, 5));
    }
}
