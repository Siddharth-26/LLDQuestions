package OnlineShoppingSystem;

import java.math.BigDecimal;

public interface PaymentService {
  public void addMethod(PaymentModes mode, PaymentStrategy paymentStrategy);
  public void removeMethod(PaymentModes mode, PaymentStrategy paymentStrategy);
  public boolean makePayment(PaymentModes mode, BigDecimal amount);
}
