package Task1;

import java.util.Comparator;

public class ComparatorTrackComposer implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getComposer().compareTo(o2.getComposer());
    }
}
