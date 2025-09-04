package CoffeeVendingMachine.payments;

public class CreditCardPaymentFactory implements PaymentFactory{
  @Override
  public Payment getPaymentObject() {
    return new CreditCardPayment();
  }
}
