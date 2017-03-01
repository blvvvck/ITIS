package Task1;

import java.util.Comparator;

public class ComparatorTrackTitle implements Comparator<Track> {
    @Override
    public int compare(Track o1, Track o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
