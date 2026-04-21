package VendingMachine2;

import java.util.concurrent.ConcurrentHashMap;

public class Inventory {
  private ConcurrentHashMap<String, Integer> itemMap;
  public Inventory(ConcurrentHashMap<String, Integer> itemMap){
    this.itemMap = itemMap;
  }
  public boolean getItem(String itemId, int count){
    int previousCount = this.itemMap.get(itemId);
    this.itemMap.computeIfPresent(itemId, (String k, Integer value)->{
      if(value>=count){
        value-=count;
        return value;
      }
      else{
        return value;
      }
    });
    if(this.itemMap.get(itemId)<=previousCount-count){
      return true;
    }
    return false;
  }
  public boolean addItem(String itemId, int count){
    int currentCount = this.itemMap.get(itemId);
    this.itemMap.put(itemId, currentCount+count);
    return true;
  }
}
