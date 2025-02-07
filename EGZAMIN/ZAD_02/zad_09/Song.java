package zad_09;

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
    public String toString() {
        return "Song [title=" + title + ", artist=" + artist + ", duration=" + duration + " seconds]";
    }

    @Override
    public int compareTo(Song o) {
        int durationComparison = Integer.compare(this.duration, o.duration);

        if (durationComparison == 0) {
            return o.title.compareTo(this.title);
        }

        return durationComparison;
    }
}