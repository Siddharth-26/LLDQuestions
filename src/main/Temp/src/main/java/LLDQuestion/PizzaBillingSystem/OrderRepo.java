package LLDQuestion.PizzaBillingSystem;

import java.util.HashMap;

public class OrderRepo {
  private HashMap<String, Order> orderMap;
  public OrderRepo(HashMap<String, Order> orderMap) {
    this.orderMap = orderMap;
  }
  public Order getOrder(String orderId) {
    return orderMap.get(orderId);
  }
  public Order addorder(Order order) {
    orderMap.put(order.getOrderId(), order);
    return order;
  }
}
