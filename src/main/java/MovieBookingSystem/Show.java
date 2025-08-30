package MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Show {
  private String showId;
  // This limit should be set based on the cinema but skipping that part to avoid boiler plate code for the current task.
  private int limit;
  // could have named it as booked seats rather than seats.
  private List<String> seats = new ArrayList<>();
  // private Cinema cinema; this is not used so not creating an extra class assuming some implementation but that is already handled as discussed.
  public Show(String id, int limit){
    this.showId = id;
    this.limit = limit;
  }
  public List<String> getSeats(){
    return this.snapshot();
  }
  private List<String> snapshot(){
    List<String> copySeats = new ArrayList<>();
    for (String x:this.seats){
      copySeats.add(x);
    }
    return copySeats;
  }
  public void addSeats(String seatId){
    this.seats.add(seatId);
  }

}
