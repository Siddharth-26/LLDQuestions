package ParkingLot;

public interface PaymentFactory {
  public PaymentStrategy getPaymentStrategy(PaymentStrategyType paymentStrategyType);
}
