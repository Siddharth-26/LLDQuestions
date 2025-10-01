package MusicStreamingPlatform;

import java.util.List;

public class Album {
  private String albumName;
  private String artistName;
  private String albumId;
  private List<Song> songList;

  public Album(String albumName, String artistName, String albumId, List<Song> songList) {
    this.albumName = albumName;
    this.artistName = artistName;
    this.albumId = albumId;
    this.songList = songList;
  }

  public String getAlbumName() {
    return albumName;
  }

  public void setAlbumName(String albumName) {
    this.albumName = albumName;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public String getAlbumId() {
    return albumId;
  }

  public void setAlbumId(String albumId) {
    this.albumId = albumId;
  }

  public List<Song> getSongList() {
    return songList;
  }
}

