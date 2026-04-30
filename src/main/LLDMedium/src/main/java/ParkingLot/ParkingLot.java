package ParkingLot;

public class ParkingLot {
  private String id;
  private VehicleType vehicleType;
  private Status status;
  public ParkingLot(String id, VehicleType vehicleType){
    this.id = id;
    this.vehicleType = vehicleType;
    this.status = Status.EMPTY;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VehicleType getVehicleType() {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType) {
    this.vehicleType = vehicleType;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public synchronized boolean tryReservation(){
    if(this.status==Status.EMPTY){
      this.setStatus(Status.OCCUPIED);
      return true;
    }
    return false;
  }
}
