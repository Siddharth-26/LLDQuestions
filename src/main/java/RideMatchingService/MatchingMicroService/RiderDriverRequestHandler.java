package RideMatchingService.MatchingMicroService;

import java.util.UUID;

import RideMatchingService.DriverPoolInterface;
import RideMatchingService.Location;
import RideMatchingService.Request;
import RideMatchingService.Response;

// This the orchestrator that exposes services like ride matching service and also exposes methods like updateDriverLocation to the client/drivers/als
public class RiderDriverRequestHandler {
  // We can have different types of matcher here which can be injected at the time of bootstrapping like tier 1 cities have different algo to match similarly tier2 etc...
  Matcher matcher;
  DriverPoolInterface driverPool;

  public RiderDriverRequestHandler(Matcher matcher, DriverPoolInterface driverPool){
    this.driverPool = driverPool;
    this.matcher = matcher;
  }

  public Response createRequest(String riderId, Location pickupLocation, Location destinationLocation){
  return this.createRequest(riderId, pickupLocation, destinationLocation, 3);
  }
  public Response createRequest(String riderId, Location pickupLocation, Location destinationLocation, int maxWaitTime){
    String requestID = UUID.randomUUID().toString();
    Request request = new Request(riderId, pickupLocation, destinationLocation, requestID);
    this.matcher.addRequest(request);
    return new Response(requestID);
  }

  public void updateDriverLocation(String driverId, Location location){
    this.driverPool.updateDriverLocation(driverId, location);
  }

}
