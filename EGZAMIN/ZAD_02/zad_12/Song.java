package zad_12;

import java.util.Objects;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int duration;

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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Song[title=" + title + ", artist=" + artist + ", duration=" + duration + " seconds]";
    }
}
