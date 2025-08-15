package RideMatchingService;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Drivers {
  private String driverId;
  private Location driverLocation;
  private List<String> ridersList = new ArrayList<>();
  private int capacity;
  private Status status;

  public String getDriverId() {
    return driverId;
  }

  public void setDriverId(String driverId) {
    this.driverId = driverId;
  }

  public void setDriverLocation(Location driverLocation) {
    this.driverLocation = driverLocation;
  }

  public List<String> getRidersList() {
    return ridersList;
  }

  public void setRidersList(List<String> ridersList) {
    this.ridersList = ridersList;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Drivers(Location location, int capacity){
    this.driverId  = UUID.randomUUID().toString();
    this.driverLocation = location;
    this.capacity = capacity;
    this.status = Status.ONLINE;
  }

  public Location getDriverLocation(){
  return this.driverLocation;
  }
  public void setLocation(Location location){
    this.driverLocation = location;
  }
  public double getDistance(Location location){
    return Math.abs(location.getLatitude()-this.driverLocation.getLatitude())+Math.abs(location.getLongitude()-this.driverLocation.getLongitude());
  }
  public void addRiders(String riderId){
    this.ridersList.add(riderId);
  }

}
