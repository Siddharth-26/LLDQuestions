package org.example.BuyNowPayLater;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderRepo {
  HashMap<String, Orders> orderMap = new HashMap<>();
  public void addOrder(Orders order) {
    orderMap.put(order.orderId, order);
  }
  public Orders getOrder(String orderId) {
    return orderMap.get(orderId);
  }
  public List<Orders> getUserOrders(String user){
    List<Orders> orders = new ArrayList<>();
    for(Orders order : orderMap.values()){
      if(order.userId==user){
        orders.add(order);
      }
    }
    return orders;
  }
}
