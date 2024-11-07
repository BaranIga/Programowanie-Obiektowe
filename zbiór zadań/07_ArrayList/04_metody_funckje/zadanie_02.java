public class Main {

    public static int nextNumber(int n) {
        if (n <= 2) {
            return -1;
        }

        for (int i = n - 1; i > 1; i--) {
            if (liczbaPierwsza(i)) {
                return i;
            }
        }
        return -1;
    }


    private static boolean liczbaPierwsza(int n) {
        if (n <= 1) {
            return false;
        }

        for(int i=2; i<n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(Main.nextNumber(4));
        System.out.println(Main.nextNumber(6));
    }
}
