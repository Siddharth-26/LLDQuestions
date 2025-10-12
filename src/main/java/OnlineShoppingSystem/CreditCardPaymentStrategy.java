package OnlineShoppingSystem;

import java.math.BigDecimal;

public class CreditCardPaymentStrategy implements PaymentStrategy{
  @Override
  public boolean pay(BigDecimal amount) {
    System.out.println("Payment made via credit card");
    try {
      Thread.sleep(400);
    }
    catch(Exception e){
      System.out.println(e);
    }
    return true;
  }
}
