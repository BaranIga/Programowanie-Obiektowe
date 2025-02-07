package zad_12;

public class TestSong {
    public static void main(String[] args) {
        Song song1 = new Song("Imagine", "John Lennon", 183);
        Song song2 = new Song("Imagine", "John Lennon", 183);
        Song song3 = new Song("Hey Jude", "The Beatles", 431);

        System.out.println("song1 equals song2: " + song1.equals(song2)); // Oczekiwany wynik: true

        // Porównanie obiektów song1 i song3
        System.out.println("song1 equals song3: " + song1.equals(song3)); // Oczekiwany wynik: false

        // Porównanie obiektów song1 i song2 za pomocą compareTo
        System.out.println("song1 compareTo song2: " + song1.compareTo(song2)); // Oczekiwany wynik: 0 (ponieważ tytuły są identyczne)

        // Porównanie obiektów song1 i song3 za pomocą compareTo
        System.out.println("song1 compareTo song3: " + song1.compareTo(song3)); // Oczekiwany wynik: ujemna liczba (bo "Imagine" < "Hey Jude")
    }
}