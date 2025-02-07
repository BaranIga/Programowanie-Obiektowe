package K35;

import java.util.*;

public class MaxFinderUtils {

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
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 500));
        books.add(new Book("Algorithms", 300));
        books.add(new Book("Data Structures", 450));

        Book maxBook = findMax(books);
        System.out.println(maxBook);
    }
}

class Book implements Comparable<Book> {
    private String title;
    private int pages;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', pages=" + pages + "}";
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}
