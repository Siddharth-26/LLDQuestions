package MovieBookingSystem;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


public class SimpleBookingStrategy implements BookingStrategy{
  ConcurrentHashMap<String, Show> showRegistry;
  public SimpleBookingStrategy(ConcurrentHashMap<String, Show> showRegistry){
    this.showRegistry = showRegistry;
  }

  @Override
  public boolean bookTickets(String showId, List<String> seatIds, String userId) {
    int length = this.showRegistry.get(showId).getSeats().size();
      this.showRegistry.compute(showId, (k, v)->{
        Show show = this.showRegistry.get(showId);
        List<String> bookedSeats = show.getSeats();
        boolean flag = true;
        for (String x: seatIds){
          if(bookedSeats.contains(x)){
            continue;
          }
          else{
            flag = false;
            break;
          }
        }
        if(flag==false){
          return show;
        }
        else{
          for (String x: seatIds){
            show.addSeats(x);
          }
          return show;
        }
      });
      if(this.showRegistry.get(showId).getSeats().size()>length){
        return true;
      }
      else {
        return false;
      }
}
}
