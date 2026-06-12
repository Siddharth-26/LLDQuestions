package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;

public class Pizza {
  private Topping topping;
  private PizzaType pizzaType;
  private BigDecimal price;
  public Pizza(PizzaType pizzaType,  BigDecimal price) {
    this.pizzaType = pizzaType;
    this.price = price;
  }
  public BigDecimal calculatePrice() {
    price.add(this.topping.getPrice());
    return price;
  }
  public boolean addTopping(Topping topping) {
   topping.addTopings(this.topping);
   this.topping = topping;
   return true;
  }
}
