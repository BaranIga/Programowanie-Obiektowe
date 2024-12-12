package zad_03;

import java.time.LocalDate;
import java.util.Arrays;

public class Book implements Comparable<Book> {
    String title;
    int numberOfPage;
    LocalDate publicationDate;

    public Book(String title, int numberOfPage, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPage = numberOfPage;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return title + " " + numberOfPage + " " + publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPage, this.numberOfPage);
    }

    public static void main(String[] args) {

        Book[] books = new Book[] {
                new Book("A", 312, LocalDate.of(2004, 5, 4)),
                new Book("A", 312, LocalDate.of(2015, 2, 10)),
                new Book("A", 312, LocalDate.of(2025, 31, 9)),
                new Book("A", 312, LocalDate.of(2003, 15, 11)),
                new Book("A", 312, LocalDate.of(1998, 24, 4))
        };

        System.out.println(books);
        Arrays.sort(books);
        System.out.println(books);
    }
}
