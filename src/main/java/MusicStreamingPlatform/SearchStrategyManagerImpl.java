package MusicStreamingPlatform;


public class SearchStrategyManagerImpl implements SearchManager{
  SongsRepo songsRepo;
  AlbumRepo albumRepo;
  PlayListRepo playListRepo;
  public SearchStrategyManagerImpl(PlayListRepo playListRepo, AlbumRepo albumRepo, SongsRepo songsRepo){
    this.songsRepo = songsRepo;
    this.albumRepo = albumRepo;
    this.playListRepo = playListRepo;
  }
  @Override
  public Song searchSongs(String id) {
    return this.songsRepo.getSong(id);
  }

  @Override
  public Playlist searchPlaylist(String id) {
    return this.playListRepo.getPlayList(id);
  }

  @Override
  public Album searchAlbums(String id) {
    return this.albumRepo.getAlbum(id);
  }
}
