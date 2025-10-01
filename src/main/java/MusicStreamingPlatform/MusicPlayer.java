package MusicStreamingPlatform;

public interface MusicPlayer extends Subscriber{
  public void play();
  public void pause();
  public void seek(int minutes, int seconds);
  public void nextSong();
  public void previousSong();
  public void stop();
  public void notifySub();
}
