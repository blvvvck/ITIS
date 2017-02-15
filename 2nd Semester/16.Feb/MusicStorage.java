import java.util.ArrayList;

public class MusicStorage {

    private ArrayList playlist = new ArrayList<Track>(100);

    public void add(Track track){
        playlist.add(track);
    }

    public String[] scan(){
        String[] sequanceOfSongs = new String[playlist.size()];

        for(int i = 0; i < playlist.size(); i++){
            sequanceOfSongs[i] = playlist.toString();
        }

        return sequanceOfSongs;
    }

    public Track search(String name){
        if name == playlist.
        return playlist.ge
    }
}
