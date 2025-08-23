package ParkingLotSystem.ticket;

import java.time.LocalDateTime;
import java.util.UUID;

public class SimpleTicket implements Ticket {
  String ticketId;
  int parkingLotId;
  int vehicleId;
  LocalDateTime dateTime;


  public SimpleTicket(int parkingLotId, int vehicleId){
    this.parkingLotId = parkingLotId;
    this.vehicleId = vehicleId;
    this.ticketId = UUID.randomUUID().toString();
    this.dateTime = LocalDateTime.now();
  }

  @Override
  public int getVehicleId() {
    return this.vehicleId;
  }

  @Override
  public int getParkingLotId() {
    return this.parkingLotId;
  }

  @Override
  public LocalDateTime getParkingTime() {
    return this.dateTime;
  }
}
