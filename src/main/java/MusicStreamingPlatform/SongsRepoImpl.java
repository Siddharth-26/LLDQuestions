package MusicStreamingPlatform;

import java.util.HashMap;

public class SongsRepoImpl implements SongsRepo {
  private HashMap<String, Song> songMap = new HashMap<>();

  public Song getSong(String songId){
    return this.songMap.get(songId);
  }
  public void addSong(Song song){
    this.songMap.put(song.getSongId(), song);
  }
}
