package ParkingLot;

import java.util.HashMap;

public class SimplePaymentFactory implements PaymentFactory{
  private HashMap<PaymentStrategyType, PaymentStrategy> map;
  public SimplePaymentFactory(HashMap<PaymentStrategyType, PaymentStrategy> map){
    this.map = map;
  }
  @Override
  public PaymentStrategy getPaymentStrategy(PaymentStrategyType paymentStrategyType) {
    if(paymentStrategyType==PaymentStrategyType.UPI){
      return new UPIPaymentStrategy();
    }
    else if(paymentStrategyType==PaymentStrategyType.CASH){
      return new CashPaymentStrategy();
    }
    return null;
  }
}
