package LLDQuestion.VendingMachine;

import java.util.HashMap;

public class VendingMachineInventory {
  // This is a thread safe inventory class that is being used for making sure that we have the product in the specified quantity.
  private HashMap<Integer, Integer> productMap;
  public VendingMachineInventory(HashMap<Integer, Integer> productMap){
    this.productMap = productMap;
  }
  public synchronized boolean reserveInventory(int productId, int amount){
    if(this.productMap.containsKey(productId)){
      int quantity = this.productMap.get(productId);
      if(quantity>=amount){
        this.productMap.put(productId, quantity-amount);
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
  public synchronized void increaseInventory(int productId, int amount){
    if(this.productMap.containsKey(productId)){
      this.productMap.put(productId, this.productMap.get(productId)+amount);
    }
    else{
      this.productMap.put(productId, amount);
    }
  }
}
