package CoffeeVendingMachine.beverages;

import java.util.HashMap;

public class Americano implements Beverage {
  private HashMap<String, Double> recipe;
  private String beverageName;
  public Americano(){
    this.beverageName = "Americano";
    this.recipe = new HashMap<>();
    this.recipe.put("Coffee", 20.0);
    this.recipe.put("Milk", 2.0);
    this.recipe.put("Water", 0.25);
  }

  @Override
  public HashMap<String,Double> getRecipe() {
    return this.recipe;
  }
}
