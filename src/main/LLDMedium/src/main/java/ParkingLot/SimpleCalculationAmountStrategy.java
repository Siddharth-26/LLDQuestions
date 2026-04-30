package ParkingLot;

import java.time.Instant;
import java.util.HashMap;

public class SimpleCalculationAmountStrategy implements CalculateAmountStrategy{
  private HashMap<VehicleType, Integer> map;
  public SimpleCalculationAmountStrategy(HashMap<VehicleType, Integer> map){
    this.map = map;
  }
  @Override
  public int calculateAmount(ReservationTicket reservationTicket) {
    Instant entryTime = reservationTicket.getEntryTime();
    Instant currTime = Instant.now();
    int diff = entryTime.compareTo(currTime);
    int multiplier = this.map.get(reservationTicket.getVehicle().getVehicleType());
    return multiplier*diff;
  }
}
