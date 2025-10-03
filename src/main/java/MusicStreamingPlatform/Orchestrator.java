package MusicStreamingPlatform;

import java.util.Arrays;
import java.util.UUID;

public class Orchestrator {
  MusicPlayerFactory musicPlayerFactory;
  PlayListManager playListManager;
  SearchManager searchManager;
  PlayerManager playerManager;

  public Orchestrator(
      MusicPlayerFactory musicPlayerFactory,
      PlayListManager playListManager,
      SearchManager searchManager,
      PlayerManager playerManager) {
    this.musicPlayerFactory = musicPlayerFactory;
    this.playListManager = playListManager;
    this.searchManager = searchManager;
    this.playerManager = playerManager;
  }

  public Song searchSong(String songId) {
    return this.searchManager.searchSongs(songId);
  }

  public Playlist searchPlaylist(String id) {
    return this.searchManager.searchPlaylist(id);
  }

  public Album searchAlbum(String id) {
    return this.searchManager.searchAlbums(id);
  }

  public void createPlaylist(String userId, String playlistName) {
    String uuid = UUID.randomUUID().toString();
    this.playListManager.createPlayList(playlistName, uuid, userId);
  }

  public void addSongtoPlaylist(String playlistId, String songId, String userId) {
    this.playListManager.addSongtoPlaylist(playlistId, songId, userId);
  }

  public void deleteSongfromPlaylist(String playlistId, String songId, String userID) {
    this.playListManager.deleteSongfromPlaylist(playlistId, songId, userID);
  }

  public void play(Playlist playlist, String userId) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.musicPlayerFactory.getMusicPlayer(playlist.getSongList());
      this.playerManager.addMusicPlayer(userId, musicPlayer);
      musicPlayer.play();
    } else {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.play();
    }
  }

  public void play(Album album, String userId) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.musicPlayerFactory.getMusicPlayer(album.getSongList());
      this.playerManager.addMusicPlayer(userId, musicPlayer);
      musicPlayer.play();
    } else {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.play();
    }
  }

  public void play(Song song, String userId) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.musicPlayerFactory.getMusicPlayer(Arrays.asList(song));
      musicPlayer.play();
      this.playerManager.addMusicPlayer(userId, musicPlayer);
    } else {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.play();
    }
  }

  public void pause(String userId) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.pause();
    } else {
      System.out.println("Plaese play the song");
    }
  }

  public void stop(String userId) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.stop();
      this.playerManager.deleteMusicPlaer(userId);
    } else {
      System.out.println("Plaese play the song");
    }
  }
  public void seek(String userId, int minutes, int seconds) {
    if (!this.playerManager.isUser(userId)) {
      MusicPlayer musicPlayer = this.playerManager.getMusicPlayer(userId);
      musicPlayer.seek(minutes, seconds);
      this.playerManager.deleteMusicPlaer(userId);
    } else {
      System.out.println("Plaese play the song");
    }
  }
  public void getRecommendation(String userId){
    // RecommendationService.getRecommendation(userId) " This service would be provided by the user..."
  }

}
