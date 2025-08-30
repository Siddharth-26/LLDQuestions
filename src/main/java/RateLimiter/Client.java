package RateLimiter;

public class Client {
  public static void main(String[] args){
    SlidingWindowStrategy slidingWindowStrategy = SlidingWindowStrategy.getInstance(10);
    Orchestrator orchestrator = new Orchestrator(slidingWindowStrategy);
    for (int i=0;i<=11;i++){
      System.out.println(i);
    orchestrator.isAllowed("user123");
    }
  }
}
