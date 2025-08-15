package RideMatchingService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DriverPoolImpl implements DriverPoolInterface{
  HashMap<String, Drivers> driverPool;
  private  static DriverPoolImpl instance;
  private DriverPoolImpl(){}

  public static DriverPoolImpl getInstance(){
    if(instance!=null){
      return instance;
    }
    else{
      instance = new DriverPoolImpl();
      return instance;
    }
  }

  @Override
  public void updateDriverLocation(String driverId, Location location) {
    if(driverPool.containsKey(driverId)){
      Drivers driver  = this.driverPool.get(driverId);
      driver.setDriverLocation(location);
    }
  }

  @Override
  public void addDriver(Drivers driver) {
  this.driverPool.put(driver.getDriverId(), driver);
  }

  @Override
  public void updateDriverStatus(String driverId, Status status) {
    if(driverPool.containsKey(driverId)){
      Drivers driver  = this.driverPool.get(driverId);
      driver.setStatus(status);
    }
  }

  public List<Drivers> getOnlineDrivers(){
    Iterator<String> iterator = this.driverPool.keySet().iterator();
    List<Drivers> onlineDrivers = new ArrayList<>();
    while(iterator.hasNext()){
      String key = iterator.next();
      Drivers driver = this.driverPool.get(key);
      if(driver.getStatus()==Status.ONLINE && driver.getCapacity()>driver.getRidersList().size()){
        onlineDrivers.add(driver);
      }
    }
    return onlineDrivers;
  }
}
