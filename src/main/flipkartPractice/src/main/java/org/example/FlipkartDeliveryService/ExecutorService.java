package org.example.FlipkartDeliveryService;

import java.util.List;

public interface ExecutorService {
  public void execute(List<Order> orders);
}
