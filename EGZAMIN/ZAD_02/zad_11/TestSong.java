package zad_11;

import java.util.ArrayList;
import java.util.Collections;

public class TestSong {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Song A", "Artist 1", 240));
        songs.add(new Song("Song B", "Artist 2", 180));
        songs.add(new Song("Song C", "Artist 3", 180));
        songs.add(new Song("Song D", "Artist 4", 300));
        songs.add(new Song("Song E", "Artist 5", 240));

        Collections.sort(songs);

        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
