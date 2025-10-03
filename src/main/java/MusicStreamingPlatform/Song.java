package MusicStreamingPlatform;

public class Song {
  private String songId;
  private int albumId;
  private String artistName;
  private int playbackMinutes;
  private int playbackSeconds;
  private String songName;

  public Song(
      String songId, int albumId, String artistName, int playbackSeconds, int playbackMinutes, String songName) {
    this.songId = songId;
    this.albumId = albumId;
    this.artistName = artistName;
    this.playbackSeconds = playbackSeconds;
    this.playbackMinutes = playbackMinutes;
    this.songName = songName;
  }

  public String getSongId() {
    return songId;
  }

  public void setSongId(String songId) {
    this.songId = songId;
  }

  public int getAlbumId() {
    return albumId;
  }

  public void setAlbumId(int albumId) {
    this.albumId = albumId;
  }

  public String getArtistName() {
    return artistName;
  }

  public void setArtistName(String artistName) {
    this.artistName = artistName;
  }

  public int getPlaybackSeconds() {
    return playbackSeconds;
  }

  public void setPlaybackSeconds(int playbackSeconds) {
    this.playbackSeconds = playbackSeconds;
  }

  public int getPlaybackMinutes() {
    return playbackMinutes;
  }

  public void setPlaybackMinutes(int playbackMinutes) {
    this.playbackMinutes = playbackMinutes;
  }

  public String getSongName() {
    return songName;
  }

  public void setSongName(String songName) {
    this.songName = songName;
  }
}
