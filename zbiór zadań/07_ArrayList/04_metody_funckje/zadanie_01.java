public class Main {

    public static int seriesSum(int n) {
        int suma = 0;

        for(int i=0; i<=n; i++) {
            if(i%2 == 0) {
                suma -= i;
            }
            else {
                suma += i;
            }
        }

        return suma;
    }


    public static void main(String[] args) {
        System.out.println(Main.seriesSum(2));
        System.out.println(Main.seriesSum(8));
    }
}
