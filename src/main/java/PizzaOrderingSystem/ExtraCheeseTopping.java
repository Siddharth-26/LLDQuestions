package PizzaOrderingSystem;

public class ExtraCheeseTopping implements Components{

  private String description = " Extra Cheese";
  private double price = 1.50;
  private final Components baseComponent;

  public ExtraCheeseTopping(Components components){
    this.baseComponent = components;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String getDescription() {
    String description = this.baseComponent.getDescription()+','+this.description;
    return description;
  }

  @Override
  public double getPrice() {
    return this.baseComponent.getPrice()+this.price;
  }
}
