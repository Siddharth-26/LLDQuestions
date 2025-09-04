package AirlineManagementSystem;

import java.time.LocalDateTime;
import java.util.List;

public interface SearchStrategy {
  public List<Flight> searchFlights(String start, String end, LocalDateTime dateTime);
}
