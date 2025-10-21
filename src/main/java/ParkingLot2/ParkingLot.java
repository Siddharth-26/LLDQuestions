package ParkingLot2;

public interface ParkingLot {
  public boolean bookParkingLot(Vehicle vehicle);
  public void emptyParkingLot();
  public String getParkingLotId();
  public String getLevel();
  public VehicleType getParkingLotType();
  public boolean isOccupied();
}
