package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
  private String orderId;
  private List<Pizza> pizzaList = new ArrayList<>();

  public Order() {
    this.orderId =  UUID.randomUUID().toString();
  }

  public boolean addPizza(Pizza pizza) {
    this.pizzaList.add(pizza);
    return true;
  }

  public Pizza getPizzaById(int pizzaId) {
    return this.pizzaList.get(pizzaId - 1);
  }

  public String getOrderId() {
    return orderId;
  }
  public BigDecimal calculateTotal() {
    BigDecimal total = new BigDecimal(0);
    for(Pizza pizza: this.pizzaList) {
      total.add(pizza.calculatePrice());
    }
    return total;
  }
}
