package MusicStreamingPlatform;

import java.util.List;

public class MusicPlayerFactory {
  public MusicPlayer getMusicPlayer(List<Song> songList){
    return new MusicPlayerImpl(songList);
  }
}
