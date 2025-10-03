package MusicStreamingPlatform;

import java.util.HashMap;

public class PlayListRepoImpl implements PlayListRepo{
  private HashMap<String, Playlist> playlistMap;
  public Playlist getPlayList(String playlistId){
    return this.playlistMap.get(playlistId);
  }
  public void addPlayList(Playlist playlist){
    this.playlistMap.put(playlist.getPlaylistId(), playlist);
  }

  @Override
  public void deletePlaylist(String id) {
    this.playlistMap.remove(id);
  }

}
