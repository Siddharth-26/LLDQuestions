package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;
import java.util.HashMap;

public class PizzaPriceRepo {
  private HashMap<PizzaType,BigDecimal> pizzaList = new HashMap<>();
  public BigDecimal getPrice(PizzaType pizzaType) {
    return pizzaList.get(pizzaType);
  }
}


