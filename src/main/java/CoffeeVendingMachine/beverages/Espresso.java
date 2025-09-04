package CoffeeVendingMachine.beverages;

import java.util.HashMap;

public class Espresso implements Beverage {
  private final HashMap<String, Double> recipe;
  private String beverageName;
  public Espresso(){
    this.beverageName = "Espresso";
    this.recipe = new HashMap<>();
    this.recipe.put("Coffee", 30.0);
    this.recipe.put("Milk", 0.0);
    this.recipe.put("Water", 0.25);
  }

  @Override
  public HashMap<String,Double> getRecipe() {
    return this.recipe;
  }
}
