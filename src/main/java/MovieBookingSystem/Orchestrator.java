package MovieBookingSystem;

import java.util.List;

public class Orchestrator {
  BookingStrategy bookingStrategy;
  public Orchestrator(BookingStrategy bookingStrategy){
    this.bookingStrategy = bookingStrategy;
  }
  public boolean bookTickets(String showId, List<String> seatIds, String userId){
    return this.bookingStrategy.bookTickets(showId, seatIds, userId);
  }
}
