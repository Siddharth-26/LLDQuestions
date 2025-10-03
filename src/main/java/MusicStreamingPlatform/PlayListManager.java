package MusicStreamingPlatform;

public interface PlayListManager {
  public Playlist createPlayList(String playlistName, String playlistId, String adminUserId);
  public void deletePlaylist(String id);
  public Playlist getPlaylist(String id);
  public void addSongtoPlaylist(String songId, String playListId, String userId);
  public void deleteSongfromPlaylist(String songId, String playListId, String userId);
}
