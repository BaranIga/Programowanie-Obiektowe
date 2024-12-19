package zad_06;

import java.util.Arrays;
import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return title + " " + artist + " " + duration;
    }


    public static void main(String[] args) {
        Song[] songs = new Song[] {
                new Song("Imagine", "John Lennon", 183),
                new Song("Hey Jude", "The Beatles", 431),
                new Song("Bohemian Rhapsody", "Queen", 354),
                new Song("Hallelujah", "Leonard Cohen", 282),
                new Song("Yesterday", "The Beatles", 125)
        };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        System.out.println(Arrays.toString(songs));
    }
}

class DurationComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.getDuration(), o2.getDuration());
    }
}

class ArtistTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        int artistComparison = o1.getArtist().compareTo(o2.getArtist());
        if (artistComparison != 0) {
            return artistComparison;
        }
        else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
}
