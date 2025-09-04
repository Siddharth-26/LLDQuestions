package AirlineManagementSystem;

import java.time.LocalDateTime;
import java.util.List;

public class Orchestrator {
  private SearchStrategy searchStrategy;
  private BookingSystem bookingSystem;

  public Orchestrator(SearchStrategy searchStrategy, BookingSystem bookingSystem){
    this.searchStrategy = searchStrategy;
    this.bookingSystem = bookingSystem;
  }
  public List<Flight> searchFlights(String from, String to, LocalDateTime datetime){
    return this.searchStrategy.searchFlights(from, to, datetime);
  }
  public boolean bookFlight(Flight flight, int count, PaymentStrategies paymentStrategies){
    return this.bookingSystem.bookFlight(count, flight, paymentStrategies);
  }
}
