package BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Venue {
  private List<Screen> screenList;
  private String venueName;
  private String venueId;
  public Venue(String venueName, String venueId){
    this.screenList = new ArrayList<>();
    this.venueName = venueName;
    this.venueId = venueId;
  }

  public List<Screen> getScreenList() {
    return screenList;
  }

  public void setScreenList(List<Screen> screenList) {
    this.screenList = screenList;
  }

  public String getVenueName() {
    return venueName;
  }

  public void setVenueName(String venueName) {
    this.venueName = venueName;
  }

  public String getVenueId() {
    return venueId;
  }

  public void setVenueId(String venueId) {
    this.venueId = venueId;
  }
}
