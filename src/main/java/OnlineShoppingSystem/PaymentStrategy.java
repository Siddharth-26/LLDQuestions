package OnlineShoppingSystem;

import java.math.BigDecimal;

public interface PaymentStrategy {
  public boolean pay(BigDecimal amount);
}
