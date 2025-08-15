package RideMatchingService;

public class Request {
  String riderId;
  Location pickupLocaion;
  Location dropLocation;
  String requestId;
  RideStatus status;

  public Request(
      String riderId, Location pickupLocaion, Location dropLocation, String requestId) {
    this.riderId = riderId;
    this.pickupLocaion = pickupLocaion;
    this.dropLocation = dropLocation;
    this.requestId = requestId;
    this.status = RideStatus.REQUESTED;
  }
  public Location getPickupLocaion(){
    return this.pickupLocaion;
  }
  public String getRequestId(){
    return this.requestId;
  }
}
