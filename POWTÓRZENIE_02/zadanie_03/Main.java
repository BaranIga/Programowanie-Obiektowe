public class Main {
    public static void main(String[] args) throws EmptyArrayException {
       Book book1 = new Book("A", "J.K.Rowling");
        Book book2 = new Book("B", "J.K.Rowling");
        Book book3 = new Book("C", "J.K.Rowling");

        Book[] books = {book1, book2, book3};

        try {
            System.out.println(Sort.sortAndReturnFirst(books));
        }
        catch (EmptyArrayException e) {
            System.out.println(e.getMessage());
        }
    }
}
