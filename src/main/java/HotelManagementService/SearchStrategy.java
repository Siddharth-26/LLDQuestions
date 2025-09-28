package HotelManagementService;

import java.util.Date;
import java.util.List;

public interface SearchStrategy {

  public List<Room> search(RoomType roomType, Date startDate, Date endDate);

}
