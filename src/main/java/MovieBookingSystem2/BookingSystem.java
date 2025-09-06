package MovieBookingSystem2;

import java.util.List;

public interface BookingSystem {
  public boolean bookTickets(List<String> seats, String concertId);
}
