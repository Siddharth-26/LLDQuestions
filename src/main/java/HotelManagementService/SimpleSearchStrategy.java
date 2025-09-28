package HotelManagementService;

import java.util.Date;
import java.util.List;

public class SimpleSearchStrategy implements SearchStrategy{
  private RoomRepository roomRepository;
  public SimpleSearchStrategy(RoomRepository roomRepository){
    this.roomRepository = roomRepository;
  }
  @Override
  public List<Room> search(RoomType roomType, Date startDate, Date endDate) {
    if(roomType==RoomType.SUITE){
      return this.roomRepository.getAvailabilitySuite(startDate, endDate);
    }
    else if (roomType==RoomType.DELUXE){
      return this.roomRepository.getAvailableDeluxe(startDate, endDate);
    }
    else{
      System.out.println("Please give a type of room that you want.. Choose from Deluxe/Suite");
      return null;
    }
  }
}
