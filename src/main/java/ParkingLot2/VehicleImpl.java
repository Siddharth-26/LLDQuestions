package ParkingLot2;

public class VehicleImpl implements Vehicle{
  private String vehicleId;
  private VehicleType vehicleType;

  @Override
  public String getVehicleId() {
    return this.vehicleId;
  }

  @Override
  public VehicleType getVehicleType() {
    return this.vehicleType;
  }
}
