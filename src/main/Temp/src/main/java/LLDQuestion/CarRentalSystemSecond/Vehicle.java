package LLDQuestion.CarRentalSystemSecond;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Vehicle {
  private int VehicleId;
  private List<LocalDateTime> reservationDates;
  public  Vehicle(int vehicleId) {
    this.VehicleId = vehicleId;
    this.reservationDates = new ArrayList<>();
  }
  public boolean checkReservation(LocalDateTime startDate, LocalDateTime endDate) {
    for (LocalDateTime date : this.reservationDates) {
      if(date.isAfter(startDate) && date.isBefore(endDate)){
        return false;
      }
    }
    return true;
  }
  public synchronized boolean reserve(LocalDateTime startDate, LocalDateTime endDate) {
    if (checkReservation(startDate, endDate)) {
      for(LocalDateTime date = startDate;date.isBefore(endDate);){
        this.reservationDates.add(date);
        LocalDateTime date2 = date.plusDays(1);
        // Do Something here..
      }
    }
    return false;
  }
//  public
}
