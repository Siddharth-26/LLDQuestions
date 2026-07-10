package org.example.DeliveryService;

import java.util.List;

public interface ExecutorService {
  public void execute(List<Order> orders);
}
