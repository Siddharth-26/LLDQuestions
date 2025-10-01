package MusicStreamingPlatform;

import java.util.HashMap;

public class AlbumRepoImpl implements AlbumRepo{
  private HashMap<String, Album> albumMap;
  public Album getAlbum(String albumId){
    return this.albumMap.get(albumId);
  }
  public void addAlbum(Album album){
    this.albumMap.put(album.getAlbumId(), album);
  }
}
