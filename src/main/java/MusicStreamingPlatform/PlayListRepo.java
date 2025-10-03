package MusicStreamingPlatform;

public interface PlayListRepo {
  public Playlist getPlayList(String playlistId);
  public void addPlayList(Playlist playlist);
  public void deletePlaylist(String id);
}
