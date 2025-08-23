package PizzaOrderingSystem;

public class VeggieSupreme implements Components{

  private double Price = 12;
  private String description = "Vegie Supreem";

  public void setPrice(double price) {
    Price = price;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String getDescription() {
    return this.description;
  }

  @Override
  public double getPrice() {
    return this.Price;
  }
}
