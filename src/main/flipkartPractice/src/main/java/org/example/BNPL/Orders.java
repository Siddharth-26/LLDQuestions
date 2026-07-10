package org.example.BNPL;

public class Orders {
  String userId;
  String orderId;
  OrderStatus orderStatus;
  public Orders(String userId, String orderId, OrderStatus orderStatus) {
    this.userId = userId;
    this.orderId = orderId;
    this.orderStatus = OrderStatus.PENDING;
  }
  public boolean updateOrderStatus(OrderStatus orderStatus) {
    if(this.orderStatus.equals(orderStatus)) {
      return false;
    }
    this.orderStatus = orderStatus;
    return true;
  }
}
