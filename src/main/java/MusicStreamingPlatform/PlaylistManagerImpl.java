package MusicStreamingPlatform;

public class PlaylistManagerImpl implements PlayListManager{
  private PlayListRepo playListRepo;
  private SongsRepo songsRepo;
  private UserRepo userRepo;
  public PlaylistManagerImpl(PlayListRepo playListRepo, SongsRepo songsRepo, UserRepo userRepo){
    this.playListRepo = playListRepo;
    this.songsRepo = songsRepo;
    this.userRepo = userRepo;
  }
  @Override
  public Playlist createPlayList(String playlistName, String playlistId, String adminUserId) {
    Playlist playlist = new Playlist(playlistName, playlistId, adminUserId);
    this.playListRepo.addPlayList(playlist);
    return playlist;
  }

  @Override
  public void deletePlaylist(String id) {
  this.playListRepo.deletePlaylist(id);
  }

  @Override
  public Playlist getPlaylist(String id) {
    return this.playListRepo.getPlayList(id);
  }

  @Override
  public void addSongtoPlaylist(String songId, String playListId, String userId) {
    Playlist playlist = this.playListRepo.getPlayList(playListId);
    if(playlist.isPublic() || playlist.checkAdmin(userId)){
    Song song = this.songsRepo.getSong(songId);
    playlist.addSong(song);
    }
    else{
      System.out.println("Not the admin and this playlist is not public");
      return;
    }
  }

  @Override
  public void deleteSongfromPlaylist(String songId, String playListId, String userId) {
    Playlist playlist = this.playListRepo.getPlayList(playListId);
    if(playlist.isPublic() || playlist.checkAdmin(userId)){
    Song song = this.songsRepo.getSong(songId);
    playlist.deleteSong(song);
    }
    else{
      System.out.println("Not the admin and playlist not public");
    }
  }
}
