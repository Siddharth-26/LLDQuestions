package CoffeeVendingMachine.beverages;

import java.util.HashMap;

public class Inventory {
  HashMap<String, Double> inventory;
  public Inventory(HashMap<String, Double> inventory){
    this.inventory = inventory;
  }
  public Double getQuantity(String ingredient){
    if(this.inventory.containsKey(ingredient)){
    return this.inventory.get(ingredient);
    }
    else{
      return 0.0;
    }
  }
  public void update(Double value, String ingredient){
    this.inventory.put(ingredient, value);
  }
}
