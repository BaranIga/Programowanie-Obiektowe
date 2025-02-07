package zad_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestMovie {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", "Christopher Nolan", "Sci-Fi"));
        movies.add(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi"));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", "Action"));
        movies.add(new Movie("Memento", "Christopher Nolan", "Thriller"));

        Collections.sort(movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
