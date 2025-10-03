package MusicStreamingPlatform;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  private String playlistName;
  private String playlistId;
  private List<Song> songList = new ArrayList<>();
  private String adminUserId;
  private boolean isPublic;

  public Playlist(String playlistName, String playlistId, String adminUserId) {
    this.playlistName = playlistName;
    this.playlistId = playlistId;
    this.adminUserId = adminUserId;
    this.isPublic = true;
  }

  public String getPlaylistName() {
    return playlistName;
  }

  public void setPlaylistName(String playlistName) {
    this.playlistName = playlistName;
  }

  public String getPlaylistId() {
    return playlistId;
  }

  public void setPlaylistId(String playlistId) {
    this.playlistId = playlistId;
  }
  public synchronized void addSong(Song song){
    this.songList.add(song);
  }
  public synchronized void deleteSong(Song song){
    this.songList.remove(song);
  }
  public List<Song> getSongList(){
    return this.songList;
  }

  public boolean isPublic() {
    return isPublic;
  }

  public void setPublic(boolean aPublic) {
    isPublic = aPublic;
  }
  public boolean checkAdmin(String admin){
    return this.adminUserId.equals(admin);
  }
}
