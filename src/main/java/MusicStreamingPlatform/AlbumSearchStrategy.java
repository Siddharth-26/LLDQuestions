package MusicStreamingPlatform;

public class AlbumSearchStrategy implements SearchStrategy<Album, String>{
  private AlbumRepo albumRepo;
  public AlbumSearchStrategy(AlbumRepo albumRepo){
    this.albumRepo = albumRepo;
  }

  @Override
  public Album search(String Id) {
    return this.albumRepo.getAlbum(Id);
  }
}
