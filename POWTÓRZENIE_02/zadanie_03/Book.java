public class Book implements Comparable<Book> {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }
}
