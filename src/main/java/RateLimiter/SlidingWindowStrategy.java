package RateLimiter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public class SlidingWindowStrategy implements RateLimiter{
  private ConcurrentHashMap<String,LinkedList<LocalDateTime>> userTimeMap;
  private static SlidingWindowStrategy instance;
  private int limit;

  private SlidingWindowStrategy(int limit){
    this.userTimeMap = new ConcurrentHashMap<>();
    this.limit = limit;
  }

  @Override
  public boolean checkIfThrottled(String userId) {
    if(this.userTimeMap.containsKey(userId)){
      LinkedList<LocalDateTime> pastRequest = this.userTimeMap.get(userId);
      while(pastRequest.peek()!=null){
        LocalDateTime firstEle = pastRequest.peekFirst();
        Long minutes = Duration.between(firstEle, LocalDateTime.now()).toSeconds();
        if(minutes>=60){
          pastRequest.pollFirst();
        }
        else{
          break;
        }
      }
      if(pastRequest.size()>=10){
        System.out.println("Throttled");
        return false;
      }
      else{
        pastRequest.offerLast(LocalDateTime.now());
        this.userTimeMap.put(userId, pastRequest);
        System.out.println("Request Passed");
        return true;
      }
    }
    else{
      LinkedList<LocalDateTime> list =  new LinkedList<>();
      list.offerLast(LocalDateTime.now());
      this.userTimeMap.put(userId, list);
      System.out.println("Request Passed");
      return true;
    }
  }
  public static SlidingWindowStrategy getInstance(int limit){
    if(instance!=null){
      return instance;
    }
    else{
      instance = new SlidingWindowStrategy(limit);
      return instance;
    }
  }

}
