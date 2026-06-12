package LLDQuestion.PizzaBillingSystem;

import java.math.BigDecimal;
import java.util.HashMap;

public class ToppingPriceRepo {
  private HashMap<ToppingType,BigDecimal> toppingPriceMap;
  public ToppingPriceRepo(HashMap<ToppingType,BigDecimal> toppingPriceMap) {
    this.toppingPriceMap = toppingPriceMap;
  }
  public BigDecimal getToppingPrice(ToppingType toppingType) {
    return this.toppingPriceMap.get(toppingType);
  }
}
