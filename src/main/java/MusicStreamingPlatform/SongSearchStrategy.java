package MusicStreamingPlatform;

public class SongSearchStrategy implements SearchStrategy<Song, String>{
  private SongsRepo songsRepo;
  public SongSearchStrategy(SongsRepo songsRepo){
    this.songsRepo = songsRepo;
  }
  @Override
  public Song search(String Id) {
    return this.songsRepo.getSong(Id);
  }
}
