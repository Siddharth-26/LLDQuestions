package RideMatchingService.MatchingMicroService;

import RideMatchingService.Request;

public interface Matcher {
  public void addRequest(Request request);
  public void matchRequest();
}
