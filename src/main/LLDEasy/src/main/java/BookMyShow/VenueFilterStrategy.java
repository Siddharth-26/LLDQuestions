package BookMyShow;

import java.util.List;

public class VenueFilterStrategy implements FilterStrategy{
  private ShowRepoImpl showRepo;
  public VenueFilterStrategy(ShowRepoImpl showRepo){
    this.showRepo = showRepo;
  }
  @Override
  public List<Shows> filterShows(Object criteria) {
    Venue venueCriteria = (Venue)criteria;
    return this.showRepo.getShows().stream().filter(obj->{
      if(obj.getScreen().getVenue().getVenueName()==venueCriteria.getVenueName()){
        return true;
      }
      return false;
    }).toList();
  }
}
