package AirlineManagementSystem;

import java.time.LocalDateTime;
import java.util.List;

public class SimpleSearchStrategy implements SearchStrategy{
  FlightDatabase flightDatabase;

  public SimpleSearchStrategy(FlightDatabase flightDatabase){
    this.flightDatabase = flightDatabase;
  }
  @Override
  public List<Flight> searchFlights(String start, String end, LocalDateTime dateTime) {
    return this.flightDatabase.getFlights(start, end, dateTime);
  }
}
