package MovieBookingSystem;

import java.util.List;

public interface BookingStrategy {
  public boolean bookTickets(String showId, List<String> seatIds, String userId);
}
