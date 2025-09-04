package CoffeeVendingMachine.beverages;

import java.util.HashMap;

public class Latte  implements Beverage {
  private HashMap<String, Double> recipe;
  private String beverageName;
  public Latte(){
    this.beverageName = "Latte";
    this.recipe = new HashMap<>();
    this.recipe.put("Coffee", 20.0);
    this.recipe.put("Milk", 1.0);
    this.recipe.put("Water", 0.25);
  }

  @Override
  public HashMap<String,Double> getRecipe() {
    return this.recipe;
  }
}
