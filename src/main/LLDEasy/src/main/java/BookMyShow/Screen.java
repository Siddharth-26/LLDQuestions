package BookMyShow;

import java.util.List;

public class Screen {
  private String screenName;
  private List<Seats> seatList;
  private Venue venue;
  public Screen(String screenName, List<Seats> seatList, Venue venue){
    this.seatList = seatList;
    this.screenName = screenName;
    this.venue = venue;
  }
  public void addSeat(Seats seats){
    this.seatList.add(seats);
  }
  public void removeSeats(Seats seats){
    int index = 0;
    for(int i =0;i<this.seatList.size();i++){
      if(this.seatList.get(i).getSeatId()==seats.getSeatId()){
        index = i;
        break;
      }
    }
    this.seatList.remove(index);
  }

  public Venue getVenue() {
    return venue;
  }

  public void setVenue(Venue venue) {
    this.venue = venue;
  }
}
