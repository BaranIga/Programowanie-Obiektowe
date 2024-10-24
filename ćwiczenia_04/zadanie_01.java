// Coś tu jest nie tak
/* Stwórz klasę Calculator, która posiada podstawowe metody
 matematyczne: dodawanie, odejmowanie, mnożenie i dzielenie.
 Zaimplementuj te metody jako metody statyczne. Utwórz drugą klasę,
 w której przetestujesz te metody bez tworzenia
 instancji klasy Calculator. */

package zadanie_01;

public class Calculator {
    public static double dodawanie(double a, double b){
        return a+b;
    }

    public static double odejmowanie(double a, double b){
        return a-b;
    }

    public static double mnozenie(double a, double b){
        return a*b;
    }

    public static double dzielenie(double a, double b){
        if (b != 0) {
            return a/b;
        }
        return 0;
    }
}

class Main {
    public static void main() {
        System.out.println(Calculator.dodawanie(2, 2));
        System.out.println(Calculator.odejmowanie(2, 2));
        System.out.println(Calculator.mnozenie(2, 2));
        System.out.println(Calculator.dzielenie(2, 2));
    }
}
