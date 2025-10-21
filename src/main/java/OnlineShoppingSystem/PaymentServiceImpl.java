package OnlineShoppingSystem;

import java.math.BigDecimal;
import java.util.HashMap;


public class PaymentServiceImpl implements PaymentService{
  private HashMap<PaymentModes, PaymentStrategy> modeMap;
  public PaymentServiceImpl(HashMap<PaymentModes, PaymentStrategy> mapMode){
    this.modeMap = mapMode;
  }
  @Override
  public void addMethod(PaymentModes mode, PaymentStrategy paymentStrategy) {
    this.modeMap.put(mode, paymentStrategy);
  }

  @Override
  public void removeMethod(PaymentModes mode, PaymentStrategy paymentStrategy) {
    this.modeMap.remove(mode);
  }

  @Override
  public boolean makePayment(PaymentModes mode, BigDecimal amount) {
    PaymentStrategy paymentStrategy = this.modeMap.get(mode);
    return paymentStrategy.pay(amount);
  }
}
