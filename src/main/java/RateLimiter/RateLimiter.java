package RateLimiter;

public interface RateLimiter {
  public boolean checkIfThrottled(String userId);
}
