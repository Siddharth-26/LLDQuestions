package HotelManagementService;

import java.util.HashMap;

public class BookingRepo {
  HashMap<String, Booking> bookingRepo;
  public BookingRepo(HashMap<String, Booking> bookingRepo){
    this.bookingRepo = bookingRepo;
  }
  public Booking getBooking(String bookingId){
    return this.bookingRepo.get(bookingId);
  }
  public void deleteBooking(String bookingId){
    this.bookingRepo.remove(bookingId);
  }
}
