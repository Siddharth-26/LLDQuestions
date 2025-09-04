package AirlineManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class SimpleSeatMap implements SeatMap {
  private List<Seat> seats;

  public SimpleSeatMap(){
    this.seats = new ArrayList<>();
  }

  @Override
  public int getAvailableSeats() {
    int count = 0;
    for (Seat x: seats){
      if(x.isBooked()==false){
        count+=1;
      }
    }
    return count;
  }

  @Override
  public String toString() {
    return "SimpleSeatMap{" + "seats=" + seats + '}';
  }
}
