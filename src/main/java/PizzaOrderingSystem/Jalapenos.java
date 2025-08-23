package PizzaOrderingSystem;

public class Jalapenos implements Components{
  private String description = " Jalapenos";
  private double price = 0.75;
  Components baseComponents;
  public Jalapenos(Components components){
    this.baseComponents = components;
  }
  @Override
  public String getDescription() {
    return this.baseComponents.getDescription()+','+this.description;
  }

  @Override
  public double getPrice() {
    return this.price+this.baseComponents.getPrice();
  }
}
