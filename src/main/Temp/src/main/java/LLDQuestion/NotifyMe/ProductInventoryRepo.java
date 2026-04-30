package LLDQuestion.NotifyMe;

import java.util.HashMap;

public class ProductInventoryRepo {
  private HashMap<Integer, Integer> productMapping;
  public ProductInventoryRepo(HashMap<Integer, Integer> productMapping){
    this.productMapping = productMapping;
  }
  public boolean addInventory(int amount, int productId){
    int currentCount = this.productMapping.get(productId);
    boolean shouldSendNotification = false;
    if(currentCount==0){
      shouldSendNotification = true;
    }
    this.productMapping.put(productId, currentCount+amount);
    return shouldSendNotification;
  }
  public int getInventory(int productId){
    return this.productMapping.get(productId);
  }

}
