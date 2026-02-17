package MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class ShowManager {
  public List<Ticket> bookTicket(List<Seat> seatList, Show show, String name, String email){
    boolean allReserved = true;
    int index = 0;
    for(int i= 0;i<seatList.size();i++){
      Seat x = seatList.get(i);
     if(x.tryToReserve()){
       index = i;
       continue;
    }
     else{
       allReserved = false;
       break;
     }
    }
    if(allReserved==false){
      for (int i=0;i<=index;i++){
        Seat x = seatList.get(i);
        x.unreserve();
      }
    }
    else{
      List<Ticket> lst = new ArrayList<>();
      for(int i= 0;i<seatList.size();i++) {
        Seat x = seatList.get(i);
        x.setStatus(Status.BOOKED);
        Ticket ticket = new Ticket(x, show, name, email);
        lst.add(ticket);
      }
      return lst;
    }
    return null;
  }
}
