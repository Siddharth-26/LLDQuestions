package ParkingLotSystem.ticket;

import java.time.LocalDateTime;

public interface Ticket {
  public int getVehicleId();
  public int getParkingLotId();
  public LocalDateTime getParkingTime();
}
