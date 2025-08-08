package org.example;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class FixedTime implements Retry{

  int retryTime = 5;
  LinkedList<List<Object>> queue;

  @Override
  public List<Request> retry() {
    List<Request> retryList = new ArrayList<>();
    while(this.queue.peek()!=null){
      List<Object> lst = this.queue.pollFirst();
      if((Integer)lst.get(1)<LocalDateTime.MAX.getMinute()+5){
        retryList.add((Request)lst.get(0));
      }
    }
    return retryList;
  }

  @Override
  public void addFailure(Request request, int time) {
    List<Object> lst = new ArrayList<>();
    lst.add(request);
    lst.add(time);
    this.queue.offerLast(lst);
  }
}
