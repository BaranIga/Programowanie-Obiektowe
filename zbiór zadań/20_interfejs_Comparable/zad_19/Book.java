package zad_19;

import java.time.LocalDate;
import java.util.Arrays;

public class Book implements Comparable<Book> {
    String title;
    String author;
    LocalDate publishDate;

    public Book(String title, String author, LocalDate publishDate) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + publishDate;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.publishDate.getYear(), o.publishDate.getYear());
    }


    public static void main(String[] args) {
        Book[] books = new Book[] {
                new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8)),
                new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11)),
                new Book("Brave New World", "Aldous Huxley", LocalDate.of(1932, 1, 1)),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", LocalDate.of(1925, 4, 10))
        };

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
