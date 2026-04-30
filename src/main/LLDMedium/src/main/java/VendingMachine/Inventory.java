package VendingMachine;

import java.util.HashMap;

public class Inventory {
  private HashMap<Integer, Integer> inventory;
  public void addItem(int itemId, int count){
    if(this.inventory.containsKey(itemId)){
    int currentStock = this.inventory.get(itemId);
    this.inventory.put(itemId, currentStock+count);
  }
    else{
      this.inventory.put(itemId, count);
    }
  }
  public boolean removeItem(int itemId, int count){
    if(!this.inventory.containsKey(itemId)){
      return false;
    }
    int currentStock = this.inventory.get(itemId);
    if(currentStock>=count){
      this.inventory.put(itemId, currentStock-count);
      return true;
    }
    else{
      return false;
    }
  }
}
