package VendingMachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
  private HashMap<Item, Integer> inventory;
  public Inventory(HashMap<Item, Integer> inventory){
    this.inventory = inventory;
  }
  public List<Item> getInventoryItems(){
    return new ArrayList<>(this.inventory.keySet());
  }
  public void reduceItem(Item item){
    this.inventory.put(item , this.inventory.get(item)-1);
  }
  public boolean checkInventory(Item item){
    if(this.inventory.get(item)>0){
      return true;
    }
    else{
      return false;
    }
  }
}
