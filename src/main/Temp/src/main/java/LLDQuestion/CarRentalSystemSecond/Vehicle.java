package LLDQuestion.CarRentalSystemSecond;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vehicle {
  private int VehicleId;
  private List<Date> reservationDates;
  public  Vehicle(int vehicleId) {
    this.VehicleId = vehicleId;
    this.reservationDates = new ArrayList<>();
  }
  public boolean checkReservation(Date startDate, Date endDate) {
    for (Date date : this.reservationDates) {
      if(date.after(startDate) && date.before(endDate)){
        return false;
      }
    }
    return true;
  }
  public synchronized boolean reserve(Date startDate, Date endDate) {
    if (checkReservation(startDate, endDate)) {
      for(Date date = startDate;date.before(endDate);){
        this.reservationDates.add(date);
        date+=1;
      }
    }
    return false;
  }
  public
}
