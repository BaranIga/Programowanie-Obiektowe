// Napisz klasę Book, która będzie zawierać trzy pola: title, author, publicationYear. 
//Następnie zaimplementuj dwa konstruktory - jeden domyślny, który nie przyjmuje żadnych
//argumentów, i drugi, który przyjmuje trzy argumenty odpowiadające polom klasy.
//W przypadku drugiego konstruktora, nazwy parametrów muszą być takie same jak nazwy pól. 
//Sprawdź czy jesteś w stanie prawidłowo przypisać wartości do pól klasy
//używając słowa kluczowego this.


public class Book {

    public String title;
    public String author;
    public int publicationYear;

    public Book() {
        this.title = "unknown";
        this.author = "unknown";
        this.publicationYear = 0;
    }

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

}
