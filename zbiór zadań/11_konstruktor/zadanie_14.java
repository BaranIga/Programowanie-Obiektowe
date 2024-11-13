//Stwórz klasę Book z prywatnymi polami: title, author, publicationYear, 
//publisher oraz numberOfPages. Dodaj konstruktor, który przyjmuje wszystkie pola 
//jako argumenty. Dodaj metody dostępowe (gettery i settery) oraz metodę 
//showInformation(), która wyświetla informacje o książce.


public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private String publisher;
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, String publisher, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void showInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of Pages: " + numberOfPages);
    }


    public static void main(String[] args) {
        Book book = new Book("twilight", "Stephenie Meyer", 2005, "Little, Brown and Company", 498);
        book.showInformation();
    }

}
