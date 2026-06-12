package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;

public class ToppingImpl implements Topping {
  private BigDecimal price = BigDecimal.ZERO;
  private Topping topping;
  private ToppingType toppingType;
  public ToppingImpl(ToppingType toppingType, BigDecimal price) {
    this.toppingType = toppingType;
    this.price = price;
  }
  @Override
  public boolean addTopings(Topping topping) {
    this.topping = topping;
    return true;
  }

  @Override
  public BigDecimal getPrice() {
    price.add(this.topping.getPrice());
    return price;
  }
}
