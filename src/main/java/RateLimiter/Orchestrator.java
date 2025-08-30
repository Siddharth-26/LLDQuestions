package RateLimiter;

public class Orchestrator {
  RateLimiter rateLimiter;
  public Orchestrator(RateLimiter rateLimiter){
    this.rateLimiter = rateLimiter;
  }
  public boolean isAllowed(String customerId){
    return this.rateLimiter.checkIfThrottled(customerId);
  }
}
