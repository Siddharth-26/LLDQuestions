package RideMatchingService;

import java.util.List;

// This is a driver Pool usually this should be like a DB or some in memory DB like redis etc...
public interface DriverPoolInterface {
  public void updateDriverLocation(String driverId, Location location);
  public void addDriver(Drivers driver);
  public void updateDriverStatus(String driverId, Status status);
  public List<Drivers> getOnlineDrivers();
}
