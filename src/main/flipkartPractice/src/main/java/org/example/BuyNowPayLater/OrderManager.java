package org.example.BuyNowPayLater;

import java.util.List;

public class OrderManager {
  OrderRepo orderRepo = new OrderRepo();
  ItemManager itemManager;
  UserManager userManager;
  VerifyOrder verifyOrder;
  public OrderManager(ItemManager itemManager, UserManager userManager, VerifyOrder verifyOrder){
    this.itemManager = itemManager;
    this.userManager = userManager;
    this.verifyOrder = verifyOrder;
  }
  public boolean placeOrder(String orderId, String user, List<String> itemsWithQuantity, int purchaseDay){
    if(this.verifyOrder.verifyOrder(user)){
        try{
          // To check if the credit limit is less than the sum total???
          return true;
        }
        catch(Exception e){

        }
    }
    return false;
  }
}
