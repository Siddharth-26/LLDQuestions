package HotelManagementService;

import java.util.Date;

public class Booking {
  private int roomNo;
  private Guest guest;
  private Date startDate;
  private Date endDate;

  public Booking(int roomNo, Guest guest, Date startDate, Date endDate) {
    this.roomNo = roomNo;
    this.guest = guest;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  public int getRoomNo() {
    return roomNo;
  }

  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }

  public Guest getGuest() {
    return guest;
  }

  public void setGuest(Guest guest) {
    this.guest = guest;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
