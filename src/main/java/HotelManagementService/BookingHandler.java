package HotelManagementService;

import java.util.Date;

public interface BookingHandler {
  public boolean book(int roomId, Date startDate, Date endDate);
}
