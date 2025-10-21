package ParkingLot2;


public interface ParkingManager {
  public Ticket parkVehicle(Vehicle vehicle);
  public void unParkVehicle(Ticket ticket);
}
