package HotelManagementService;

public class CheckInCheckoutHandler {
  private RoomRepoInterface roomRepository;
  private  GuestRepoInterface guestRepo;
  BookingRepoInterface bookingRepo;
  public CheckInCheckoutHandler(RoomRepoInterface roomRepository, GuestRepoInterface guestRepo, BookingRepoInterface bookingRepo){
    this.roomRepository = roomRepository;
    this.guestRepo = guestRepo;
    this.bookingRepo = bookingRepo;
  }
  public boolean checkIn(String bookingId, Guest guest){
    Booking booking = this.bookingRepo.getBooking(bookingId);
    if(booking.getGuest()==guest){
      int roomNumber = booking.getRoomNo();
      Room room = this.roomRepository.getRoom(roomNumber);
      room.setStatus(RoomStatus.OCCUPIED);
      return true;
    }
    else{
      System.out.println("The guest check failed that means that you are not the guest who booked the room.");
    }
    return false;
  }
  public boolean checkout(String bookingId, Guest guest){
    Booking booking = this.bookingRepo.getBooking(bookingId);
    if(booking.getGuest()==guest){
      this.bookingRepo.deleteBooking(bookingId);
      int roomNo = booking.getRoomNo();
      Room room = this.roomRepository.getRoom(roomNo);
      room.setStatus(RoomStatus.AVAILABLE);
      return true;
    }
    else{
      return false;
    }
  }
}
