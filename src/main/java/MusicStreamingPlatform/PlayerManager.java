package MusicStreamingPlatform;

public interface PlayerManager{
  public void addMusicPlayer(String userId, MusicPlayer musicPlayer);
  public void deleteMusicPlaer(String userId);
  public boolean isUser(String userId);
  public MusicPlayer getMusicPlayer(String userId);
}
