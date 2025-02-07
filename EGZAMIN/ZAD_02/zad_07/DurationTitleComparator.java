package zad_07;

import java.util.Comparator;

public class DurationTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        int durationComparison = Integer.compare(o1.duration(), o2.duration());

        if (durationComparison == 0) {
            o1.title().compareTo(o2.title());
        }

        return durationComparison;
    }
}
