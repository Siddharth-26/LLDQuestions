package MusicStreamingPlatform;

import java.util.HashMap;

public class PlayerManagerImpl implements PlayerManager{
  private HashMap<String, MusicPlayer> playerHashMap = new HashMap<>();
  @Override
  public void addMusicPlayer(String userId, MusicPlayer musicPlayer) {
    this.playerHashMap.put(userId, musicPlayer);
  }

  @Override
  public void deleteMusicPlaer(String userId) {
    this.playerHashMap.remove(userId);
  }

  @Override
  public boolean isUser(String userId) {
    return this.playerHashMap.containsKey(userId);
  }

  @Override
  public MusicPlayer getMusicPlayer(String userId) {
    return this.playerHashMap.get(userId);
  }
}
