import java.util.List;
public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Favorites");

        playlist.addTrack("Song 1");
        playlist.addTrack("Song 2");
        playlist.addTrack("Song 3");

        System.out.println("Number of tracks: " + playlist.size());
        System.out.println("Tracks: " + playlist.getTracks());

        List<String> tracks = playlist.getTracks();

    }
}
