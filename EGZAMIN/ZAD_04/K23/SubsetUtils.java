package K23;

import java.util.*;

public class SubsetUtils {

    public static <E> boolean isSubset(HashSet<E> set1, HashSet<E> set2) {
        for (E element : set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        HashSet<Book> set1 = new HashSet<>();
        set1.add(new Book("Java Basics", "John Doe"));
        set1.add(new Book("Data Structures", "Jane Smith"));

        HashSet<Book> set2 = new HashSet<>();
        set2.add(new Book("Java Basics", "John Doe"));
        set2.add(new Book("Data Structures", "Jane Smith"));
        set2.add(new Book("Algorithms", "Alan Turing"));

        System.out.println(isSubset(set1, set2));

    }
}

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
