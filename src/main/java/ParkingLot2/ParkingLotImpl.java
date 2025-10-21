package ParkingLot2;

public class ParkingLotImpl implements ParkingLot{
  private Vehicle vehicle;
  private String parkingLotId;
  private String level;
  private VehicleType vehicleType;

  public ParkingLotImpl(String parkingLotId, String level) {
    this.parkingLotId = parkingLotId;
    this.level = level;
  }

  @Override
  public synchronized boolean bookParkingLot(Vehicle vehicle) {
    if(this.vehicle==null){
    this.vehicle = vehicle;
    return true;
    }
    return false;
  }

  @Override
  public void emptyParkingLot() {
    this.vehicle = null;
  }

  @Override
  public String getParkingLotId() {
    return this.parkingLotId;
  }

  @Override
  public String getLevel() {
    return this.level;
  }

  @Override
  public VehicleType getParkingLotType() {
    return this.vehicleType;
  }

  @Override
  public boolean isOccupied() {
    if(this.vehicle==null){
      return true;
    }
    return false;
  }
}
