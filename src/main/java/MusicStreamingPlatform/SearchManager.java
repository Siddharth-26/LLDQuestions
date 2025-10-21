package MusicStreamingPlatform;


public interface SearchManager {
  public Song searchSongs(String id);
  public Playlist searchPlaylist(String id);
  public Album searchAlbums(String id);
}
