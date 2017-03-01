package Task1;

import java.util.Comparator;

public class ComparatorTrackDuration implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return ((Integer) o1.getDuration()).compareTo(o2.getDuration());
    }
}
