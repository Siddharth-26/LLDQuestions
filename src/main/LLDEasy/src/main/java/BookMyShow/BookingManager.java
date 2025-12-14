package BookMyShow;

public class BookingManager {
  public ShowRepoImpl showRepo;
  public BookingManager(ShowRepoImpl showRepo){
    this.showRepo = showRepo;
  }
}
