package zad_03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("A", 312, LocalDate.now()));
        books.add(new Book("D", 432, LocalDate.now()));
        books.add(new Book("R", 851, LocalDate.now()));

        System.out.println(books);
        Collections.sort(books);
        System.out.println(books);
    }
}
