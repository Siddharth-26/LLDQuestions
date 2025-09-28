package HotelManagementService;

import java.util.Date;

public interface Room {
  public boolean book(Date startDate, Date endDate);
  public boolean checkAvailability(Date startDate, Date endDate);
  public RoomType getType();
  public void setStatus(RoomStatus status);
  public int getPricePerNight();
  public void setPricePerNight(int price);
}
