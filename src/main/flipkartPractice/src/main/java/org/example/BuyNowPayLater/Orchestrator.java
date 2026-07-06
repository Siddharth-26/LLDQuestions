package org.example.BuyNowPayLater;

import java.util.List;

public class Orchestrator {
  ItemManager itemManager;
  UserManager userManager;
  OrderManager orderManager;

  public Orchestrator(ItemManager itemManager) {
    this.itemManager = itemManager;
  }
  public void seedInventory(List<String> inventoryLines) {
    this.itemManager.seedInventory(inventoryLines);
  }
  public void viewInventory() {
    this.itemManager.viewInventory();
  }
  public void registerUser(String userName, int creditLimit){
    this.userManager.registerUser(userName, creditLimit);
  }
  public boolean buy(String orderId, String user, List<String> itemsWithQuantity, int purchaseDay){
//    this.orderManager.placeOrder(String orderId, String user, List<String> itemsWithQuantity, int purchaseDay);
      return true;
  }
}

