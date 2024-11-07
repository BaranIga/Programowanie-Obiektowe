public class Main {

    public static boolean perfectNumber(int n) {
        int suma_dzielnikow = 0;

        for(int i=1; i<n; i++) {
            if(n%i == 0) {
                suma_dzielnikow += i;
            }
        }

        if(n == suma_dzielnikow) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Main.perfectNumber(6));
        System.out.println(Main.perfectNumber(1));
        System.out.println(Main.perfectNumber(3));
    }
}
