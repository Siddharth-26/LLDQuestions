package PizzaOrderingSystem;

public class Margherita implements Components{
  private String description = "Margherita";
  private double price = 10;

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public double getPrice() {
    return this.price;
  }
}
