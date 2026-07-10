package org.example.DeliveryService;

import java.util.HashMap;
import java.util.List;

public class OrderRepo {
  HashMap<String, Order> orderMap = new HashMap<String, Order>();
  public void addOrder(Order order){
    this.orderMap.put(order.orderName, order);
  }
  public List<Order> getOrders(){
    return this.orderMap.values().stream().toList();
  }
}
