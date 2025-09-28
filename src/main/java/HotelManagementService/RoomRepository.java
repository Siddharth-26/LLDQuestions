package HotelManagementService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class RoomRepository {
  HashMap<Integer, Room> roomRepo;
  public RoomRepository(HashMap<Integer, Room> roomRepo){
    this.roomRepo = roomRepo;
  }
  public List<Room> getAvailableDeluxe(Date startDate, Date endDate){
    return this.roomRepo.values().stream().filter((room)->{
      if(room.getType()==RoomType.DELUXE){
        return true;
      }
      return false;
    }).filter((room)->{
      if (room.checkAvailability(startDate, endDate)) {
        return true;
      }
      return false;
    }).toList();
  }
  public List<Room> getAvailabilitySuite(Date startDate, Date endDate){
    return this.roomRepo.values().stream().filter((room)->{
      if(room.getType()==RoomType.SUITE){
        return true;
      }
      return false;
    }).filter((room)->{
      if (room.checkAvailability(startDate, endDate)) {
        return true;
      }
      return false;
    }).toList();
  }
  public Room getRoom(int roomId){
    return this.roomRepo.get(roomId);
  }
}
