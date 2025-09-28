package HotelManagementService;

public interface BookingRepoInterface {
  public Booking getBooking(String bookingId);
  public void deleteBooking(String bookingId);
}
