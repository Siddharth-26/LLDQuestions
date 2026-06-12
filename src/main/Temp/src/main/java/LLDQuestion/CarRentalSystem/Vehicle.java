package LLDQuestion.CarRentalSystem;

public class Vehicle {
  private String vehicleId;
  private VehicleTypes vehicleType;

  public VehicleTypes getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleTypes vehicleType) {
    this.vehicleType = vehicleType;
  }

  public String getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(String vehicleId) {
    this.vehicleId = vehicleId;
  }
}
