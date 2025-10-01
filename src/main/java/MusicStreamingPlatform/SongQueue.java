package MusicStreamingPlatform;

public interface SongQueue {
  public Song getCurrentSong();
  public Song getNextSong();
  public Song getPreviousSong();
}
