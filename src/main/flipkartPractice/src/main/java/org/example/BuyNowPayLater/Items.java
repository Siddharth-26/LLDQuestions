package org.example.BuyNowPayLater;

public class Items {
  int price;
  String itemName;
  public Items(int price, String itemName) {
    this.price = price;
    this.itemName = itemName;
  }
  public int getPrice() {
    return price;
  }
  public String getItemName() {
    return itemName;
  }
}
