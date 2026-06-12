package LLDQuestion.CarRentalSystem;

import java.util.HashMap;

public class PaymentService {
  private HashMap<PaymentType, PaymentStrategy> paymentTypeMap;
  public PaymentService(HashMap<PaymentType, PaymentStrategy> paymentTypeMap) {
    this.paymentTypeMap = paymentTypeMap;
  }

  public PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
    return paymentTypeMap.get(paymentType);
  }
  public void addPaymentStrategy(PaymentType paymentType, PaymentStrategy paymentStrategy) {
    this.paymentTypeMap.put(paymentType, paymentStrategy);
  }
}
