package CoffeeVendingMachine.beverages;

import java.util.HashMap;

public class BeverageRegistry {
  HashMap<BeverageType, BeverageFactory> beverageRegistry;
  private Inventory inventory;
  public BeverageRegistry(Inventory inventory){
    this.inventory = inventory;
  }
  public Beverage getBeverage(BeverageType beverageType){
    if(this.checkIngredients(beverageType)!=null) {
      return this.beverageRegistry.get(beverageType).getBeverage();
    }
    return null;
  }
  private Beverage checkIngredients(BeverageType beverageType){
    Beverage bev = this.beverageRegistry.get(beverageType).getBeverage();
    HashMap<String, Double> recipe = bev.getRecipe();
    for (String x:recipe.keySet()){
      if(recipe.get(x)>inventory.getQuantity(x)){
        return null;
      }
      else{
        continue;
      }
    }
    for (String x:recipe.keySet()){
      inventory.update(inventory.getQuantity(x)- recipe.get(x), x);
    }
    return bev;
  }
}
