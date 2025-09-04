package AirlineManagementSystem;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

public class FlightDatabase {
  private HashMap<String, HashMap<String, List<Flight>>> sourceDestinationFlights;
  public FlightDatabase(){
    this.sourceDestinationFlights = new HashMap<String, HashMap<String, List<Flight>>>();
  }
  public List<Flight> getFlights(String source, String destination, LocalDateTime dateTime){
    // Here the logic will reside to get the data from the database for the date for the source and destination.. Right now no matter what the date is we give the same data... Meaning for every date same flights fly from source to destination;
    HashMap<String, List<Flight>> map= this.sourceDestinationFlights.get(source);
    return map.get(destination);
  }
}
