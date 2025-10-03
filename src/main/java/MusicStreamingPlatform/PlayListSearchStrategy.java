package MusicStreamingPlatform;

public class PlayListSearchStrategy implements SearchStrategy<Playlist, String>{
  private PlayListRepo playListRepo;
  public PlayListSearchStrategy(PlayListRepo playListRepo){
    this.playListRepo = playListRepo;
  }
  @Override
  public Playlist search(String Id) {
    return this.playListRepo.getPlayList(Id);
  }
}
