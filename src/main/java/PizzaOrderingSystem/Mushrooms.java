package PizzaOrderingSystem;

public class Mushrooms implements Components{
  private Components baseComponents;
  private String description = " Mushrooms";
  private double price = 1.0;
  public Mushrooms(Components components){
    this.baseComponents = components;
  }
  @Override
  public String getDescription() {
    return this.baseComponents.getDescription()+','+this.description;
  }

  @Override
  public double getPrice() {
    return this.baseComponents.getPrice()+this.price;
  }
}
