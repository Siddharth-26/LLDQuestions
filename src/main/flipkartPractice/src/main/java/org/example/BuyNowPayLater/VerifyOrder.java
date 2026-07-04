package org.example.BuyNowPayLater;

public class VerifyOrder {
  ItemManager itemManager;
  UserManager userManager;
  public VerifyOrder(ItemManager itemManager, UserManager userManager){
    this.itemManager = itemManager;
    this.userManager = userManager;
  }
  public boolean verifyOrder(String userName){
    return this.userManager.verifyUser(userName);
  }
}
