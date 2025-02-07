package zad_07;

import java.util.Arrays;

public class TestSong {
    public static void main(String[] args) {
        Song[] songs = new Song[] {
                new Song("Song A", "Artist 1", 180),
                new Song("Song B", "Artist 2", 240),
                new Song("Song C", "Artist 3", 150),
                new Song("Song D", "Artist 4", 150),
                new Song("Song E", "Artist 5", 200)
        };

        Arrays.sort(songs, new DurationTitleComparator());

        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
