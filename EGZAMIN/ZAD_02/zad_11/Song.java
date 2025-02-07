package zad_11;

public record Song(String title, String artist, int duration) implements Comparable<Song> {
    @Override
    public int compareTo(Song other) {
        int durationComparison = Integer.compare(this.duration, other.duration);

        if (durationComparison == 0) {
            return other.title.compareTo(this.title);
        }

        return durationComparison;
    }

    @Override
    public String toString() {
        return "Song[title=" + title + ", artist=" + artist + ", duration=" + duration + " seconds]";
    }
}
