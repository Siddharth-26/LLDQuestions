package MovieBookingSystem;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
  public static void main(String[] args) {
    Show show1 = new Show("1", 5);
    ConcurrentHashMap<String, Show> showRegistry = new ConcurrentHashMap<>();
    showRegistry.put("1", show1);
    Orchestrator orchestrator = new Orchestrator(new SimpleBookingStrategy(showRegistry));
    show1.addSeats("1");
    show1.addSeats("2");
    orchestrator.bookTickets("1", Arrays.asList(new String[]{"3", "4", "5"}), "SID");
  }
}
