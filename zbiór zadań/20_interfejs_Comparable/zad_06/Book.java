package zad_06;

import java.time.LocalDate;
import java.util.Arrays;

public class Book implements Comparable<Book> {
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return title + " " + numberOfPages + " " + publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages, this.numberOfPages);
    }


    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("abc", 170, LocalDate.of(2020, 5, 13)),
            new Book("def", 340, LocalDate.of(2004, 10, 2)),
            new Book("tyh", 550, LocalDate.of(2013, 12, 25))
        };

        Arrays.sort(books);

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
