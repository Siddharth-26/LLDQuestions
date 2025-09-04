package CoffeeVendingMachine.payments;

import java.util.HashMap;

public class PaymentRegistry {
  HashMap<PaymentMethod, Payment> paymentRegistry;
  public PaymentRegistry(HashMap<PaymentMethod, Payment> paymentRegistry){
    this.paymentRegistry = paymentRegistry;
  }
  public Payment getPaymentObject(PaymentMethod paymentMethod){
    return this.paymentRegistry.get(paymentMethod);
  }
}
