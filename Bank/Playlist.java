import java.util.*;
class Playlist {
	private String name;
	private List<String> tracks;

	public Playlist(String name){
		this.tracks = new ArrayList<>();
	}

	public void addTrack(String track){
		this.tracks.add(track);
	}

	public int size(){
		return this.tracks.size();
	}

	public List<String> getTracks(){
		return List.copyOf(this.tracks);
	}
}