package HotelManagementService;

import java.util.Date;
import java.util.List;

public interface RoomRepoInterface {
  public List<Room> getAvailableDeluxe(Date startDate, Date endDate);
  public List<Room> getAvailabilitySuite(Date startDate, Date endDate);
  public Room getRoom(int roomId);
}
