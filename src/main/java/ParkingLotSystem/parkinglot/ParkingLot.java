package ParkingLotSystem.parkinglot;

public abstract class ParkingLot {
  int parkingLotId;
  ParkingLotType parkingLotType;
  boolean isOccupied;
  int vehicleId;
  // There can be another parameter here that is floors right and so based on the idea and the scope of parking complex we would basically make this one.

  public boolean isOccupied() {
    return isOccupied;
  }

  public void setOccupied(boolean occupied) {
    isOccupied = occupied;
  }

  public ParkingLot(int parkingLotId, ParkingLotType parkingLotType) {
    this.parkingLotId = parkingLotId;
    this.parkingLotType = parkingLotType;
    this.isOccupied = false;
  }

  public int getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(int vehicleId) {
    this.vehicleId = vehicleId;
  }

  public ParkingLotType getParkingLotType() {
    return parkingLotType;
  }

  public void setParkingLotType(ParkingLotType parkingLotType) {
    this.parkingLotType = parkingLotType;
  }

  public int getParkingLotId() {
    return parkingLotId;
  }

  public void setParkingLotId(int parkingLotId) {
    this.parkingLotId = parkingLotId;
  }
}
