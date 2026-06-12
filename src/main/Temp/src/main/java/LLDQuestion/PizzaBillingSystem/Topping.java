package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;

public interface Topping {
  public boolean addTopings(Topping toping);
  public BigDecimal getPrice();
}
