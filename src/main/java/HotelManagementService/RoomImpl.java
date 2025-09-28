package HotelManagementService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class RoomImpl implements Room{
  private int roomNo;
  private List<List<Date>> bookingDates;
  private RoomType type;
  private RoomStatus status;
  private int pricePerNight;
  public RoomImpl(int roomNo, RoomType type){
    this.roomNo = roomNo;
    this.bookingDates = new ArrayList<>();
    this.type = type;
  }
  @Override
  public synchronized boolean book(Date startDate, Date endDate) {
    try {
      if (this.checkAvailability(startDate, endDate)) {
        Date[] arr = {startDate, endDate};
        this.bookingDates.add(Arrays.stream(arr).toList());
        return true;
      }
      else{
        return false;
      }
    }
    catch (Exception e){
      System.out.println(e);
      return false;
    }
    finally{
      return false;
    }
  }

  @Override
  public boolean checkAvailability(Date startDate, Date endDate) {
    List<DateCount> tempList = new ArrayList<>();
    tempList.add(new DateCount(startDate, 1));
    tempList.add(new DateCount(endDate, -1));
    for (List<Date> x: this.bookingDates){
      DateCount obj = new DateCount(x.get(0), 1);
      DateCount obj2 = new DateCount(x.get(1), -1);
      tempList.add(obj);
      tempList.add(obj2);
    }
    tempList.sort((row1, row2)->{
      int compare = row1.getDate().compareTo(row2.getDate());
      if(compare<0){
        return -1;
      }
      else if(compare==0){
        int compare2 = Integer.compare(row1.getCount(), row2.getCount());
        if(compare2>0){
          return 1;
        }
        else if(compare2<0){
          return -1;
        }
        else{
          return 0;
        }
      }
      else{
        return 1;
      }
    });
    int curr = 0;
  for(DateCount x:tempList){
    curr+=x.getCount();
    if(curr>1){
      return false;
    }
  }
  return true;
  }

  @Override
  public RoomType getType() {
    return this.type;
  }

  @Override
  public void setStatus(RoomStatus status) {
    this.status = status;
  }

  @Override
  public int getPricePerNight() {
    return this.pricePerNight;
  }

  @Override
  public void setPricePerNight(int pricePerNight) {
  this.pricePerNight = pricePerNight;
  }
}
