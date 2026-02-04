package ParkingLot;

public class Vehicle {
  private VehicleType vehicleType;
  private String vehicleId;
  public Vehicle(VehicleType vehicleType, String vehicleId){
    this.vehicleType = vehicleType;
    this.vehicleId = vehicleId;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }
}
