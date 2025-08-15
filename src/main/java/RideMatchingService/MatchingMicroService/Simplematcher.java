package RideMatchingService.MatchingMicroService;

import java.util.LinkedList;
import java.util.List;

import RideMatchingService.DriverPoolInterface;
import RideMatchingService.Drivers;
import RideMatchingService.NotificationClient;
import RideMatchingService.Request;

public class Simplematcher implements Matcher{

  DriverPoolInterface driverPool;
  LinkedList<Request> queue = new LinkedList<>();
  private static Simplematcher instance;
  NotificationClient notifier;
  private Simplematcher(DriverPoolInterface driverPool, NotificationClient notifier){
    this.driverPool = driverPool;
    this.notifier = notifier;
  }

  @Override
  public void addRequest(Request request) {
    this.queue.add(request);
    this.matchRequest();
  }


  public void matchRequest(){
    List<Drivers> onlineDrivers = this.driverPool.getOnlineDrivers();
    while(queue.peek()!=null){
      Request request = queue.pollFirst();
      Drivers closestDriver = null;
      double closestDist = Integer.MAX_VALUE;
      for (Drivers x: onlineDrivers){
        if(x.getDistance(request.getPickupLocaion())<=closestDist){
          closestDist = x.getDistance(request.getPickupLocaion());
          closestDriver = x;
        }
      }
      if(closestDriver!=null){
      closestDriver.addRiders(request.getRequestId());
      if(closestDriver.getRidersList().size()==closestDriver.getCapacity()){
      onlineDrivers.remove(closestDriver);
      }
      this.notifier.sendMessage();
      }
      else{
        queue.offerLast(request);
      }
    }
  }

  public static Simplematcher getInstance(DriverPoolInterface driverPool, NotificationClient notifier){
    if(instance!=null){
      return instance;
    }
    else{
      instance = new Simplematcher(driverPool, notifier);
      return instance;
    }
  }

}
