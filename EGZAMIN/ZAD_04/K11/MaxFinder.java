package K11;

import java.util.*;

class Book implements Comparable<Book> {
    String title;
    int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ", " + pages + ".";
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pages, o.pages);
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

public class MaxFinder {

    public static <T extends Comparable<T>> T findMax(Collection<T> items) {
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Collection cannot be null or empty");
        }

        T max = null;
        for (T item : items) {
            if (max == null || item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", 300),
                new Book("Data Structures", 450),
                new Book("Algorithms", 500)
        );

        Book maxBook = findMax(books);
        System.out.println("Book with most pages: " + maxBook);
    }
}
