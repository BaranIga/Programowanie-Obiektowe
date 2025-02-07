package zad_03;

public class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + title + ": " + director + ": " + genre;
    }

    @Override
    public int compareTo(Movie other) {
        if (other.title.length() != this.title.length()) {
            return Integer.compare(other.title.length(), this.title.length());
        }
        return this.title.compareTo(other.title);
    }
}
