package MusicStreamingPlatform;

public interface AlbumRepo {
  public Album getAlbum(String albumId);
  public void addAlbum(Album album);
}
