package MusicStreamingPlatform;

public interface SongsRepo {
  public Song getSong(String songId);
  public void addSong(Song song);
}
