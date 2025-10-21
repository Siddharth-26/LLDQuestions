package ParkingLot2;

public class Orchestrator {
  private ParkingManager parkingManager;

  public Orchestrator(ParkingManager parkingManager) {
    this.parkingManager = parkingManager;
  }
  public Ticket parkVehicle(Vehicle vehicle){
    return this.parkingManager.parkVehicle(vehicle);
  }
  public void unparkVehicle(Ticket ticket){
    this.parkingManager.unParkVehicle(ticket);
  }
}
