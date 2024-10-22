/* Zaprojektuj klasę Square, która posiada pole side oraz konstruktor,
który umożliwia ustawienie wartości tego pola.
Następnie napisz drugi konstruktor, który nie przyjmuje żadnych argumentów,
a jedynie wywołuje pierwszy konstruktor z wartością domyślną 1. */

package zadanie_05;

public class square {
    public int side;

    public square(int side){
        this.side = side;
    }

    public square(){
        this(-1);
    }

    public static void main(String[] args){
        square kwadrat = new square();
        System.out.println(kwadrat.side);
    }
}
