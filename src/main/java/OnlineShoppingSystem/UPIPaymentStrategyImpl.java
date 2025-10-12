package OnlineShoppingSystem;

import java.math.BigDecimal;

public class UPIPaymentStrategyImpl implements PaymentStrategy{
  @Override
  public boolean pay(BigDecimal amount) {
    System.out.println("Payment made via UPI method.");
    return true;
  }
}
