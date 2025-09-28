package HotelManagementService;

import java.util.Date;
import java.util.List;

public class Orchestrator {
  private BookingHandler bookingHandler;
  private SearchStrategy searchStrategy;
  private CheckInCheckoutHandler checkInCheckoutHandler;
  public Orchestrator(BookingHandler bookingHandler, SearchStrategy searchStrategy, CheckInCheckoutHandler checkInCheckoutHandler){
    this.bookingHandler = bookingHandler;
    this.searchStrategy = searchStrategy;
    this.checkInCheckoutHandler = checkInCheckoutHandler;
  }

  public List<Room> checkAvailability(RoomType roomtype, Date startDate, Date endDate){
    return this.searchStrategy.search(roomtype, startDate, endDate);
  }
  public boolean book(int roomNo, Date startDate, Date endDate){
    return this.bookingHandler.book(roomNo, startDate, endDate);
  }
  public boolean checkIn(String bookingId, Guest guest){
    return this.checkInCheckoutHandler.checkIn(bookingId, guest);
  }
  public boolean checkOut(String bookingId, Guest guest){
    return this.checkInCheckoutHandler.checkout(bookingId, guest);
  }
}
