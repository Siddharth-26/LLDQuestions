package HotelManagementService;

import java.util.Date;

public class BookingHandlerImpl implements BookingHandler {
  private RoomRepository roomRepository;
  private PaymentStrategy paymentStrategy;
  public BookingHandlerImpl(RoomRepository roomRepository, PaymentStrategy paymentStrategy){
    this.roomRepository = roomRepository;
    this.paymentStrategy = paymentStrategy;
  }
  @Override
  public boolean book(int roomId, Date startDate, Date endDate) {
    Room room = this.roomRepository.getRoom(roomId);
    int amount = room.getPricePerNight()*(startDate.compareTo(endDate));
    this.paymentStrategy.makePayment(amount);
    return room.book(startDate, endDate);
  }
}
