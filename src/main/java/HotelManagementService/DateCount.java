package HotelManagementService;

import java.util.Date;

public class DateCount {
  private final Date date;
  private final int count;
  public DateCount(Date date, int count){
    this.date = date;
    this.count = count;
  }
  public Date getDate(){
    return this.date;
  }
  public int getCount(){
    return this.count;
  }
}
