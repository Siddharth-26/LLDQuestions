package ParkingLot;

import java.time.Instant;
import java.util.List;

public class SimpleParkingStrategy implements ParkingStrategy{
  private FloorRepo floorRepo;
  public SimpleParkingStrategy(FloorRepo floorRepo){
    this.floorRepo = floorRepo;
  }
  @Override
  public ReservationTicket assignParkingLot(Vehicle vehicle) {
    List<ParkingLot> parkingLotList = this.floorRepo.getFloor(vehicle.getVehicleType());
    for (ParkingLot x:parkingLotList){
      if(x.tryReservation()){
        x.setStatus(Status.OCCUPIED);
        ReservationTicket ticket = new ReservationTicket(x, vehicle, Instant.now());
        return ticket;
      }
    }
    return null;
  }
}
