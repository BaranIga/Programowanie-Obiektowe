// Zaprojektuj klasę Square, która posiada pole side oraz konstruktor, który 
//umożliwia ustawienie wartości tego pola. Następnie napisz drugi konstruktor, który nie
//przyjmuje żadnych argumentów, a jedynie wywołuje pierwszy konstruktor 
//z wartością domyślną 1.

public class Square {

    public int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
        this(1);
    }
}
