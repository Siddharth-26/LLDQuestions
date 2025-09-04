package CoffeeVendingMachine.payments;

public class UPIPaymentsFactory implements PaymentFactory{

  @Override
  public Payment getPaymentObject() {
    return new UPIPayment();
  }
}
