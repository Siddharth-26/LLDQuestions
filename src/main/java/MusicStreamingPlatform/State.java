package MusicStreamingPlatform;

public interface State {
  public void play();
  public void pause();
  public void seek(int minutes, int seconds);
  public void nextSong();
  public void previousSong();
  public void stop();
}
