package org.example.DeliveryService;

public class Order {
  String orderName;
  String pincode;
  String creationTime;
  public Order(String orderName, String pincode, String creationTime) {
    this.orderName = orderName;
    this.pincode = pincode;
    this.creationTime = creationTime;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public String getPincode() {
    return pincode;
  }

  public void setPincode(String pincode) {
    this.pincode = pincode;
  }

  @Override
  public String toString() {
    return "Order{name='" + orderName + "', pincode='" + pincode + "', creationTime='" + creationTime + "'}";
  }
}
