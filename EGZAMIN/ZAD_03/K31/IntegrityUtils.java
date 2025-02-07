package K31;

public class IntegrityUtils {

    public static <T> void announceIfUnique(T a, T b, T c) {
        if (a != null && b != null && c != null && !a.equals(b) && !b.equals(c) && !a.equals(c)) {
            System.out.println("Każdy argument jest unikalny");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("Witcher", "Andrzej Sapkowski");
        Book book2 = new Book("Hobbit", "J.R.R. Tolkien");
        Book book3 = new Book("Dune", "Frank Herbert");

        announceIfUnique(book1, book2, book3);

        Book book4 = new Book("Witcher", "Some Author");
        announceIfUnique(book1, book2, book4);
    }
}

class Book {
    String title;
    String author;

    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Book book = (Book) obj;
        return title.equals(book.title);
    }
}
