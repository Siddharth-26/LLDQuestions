package CoffeeVendingMachine.payments;

public class CreditCardPayment implements Payment{
  @Override
  public boolean pay() {
    System.out.println("Paying via Credit Card...");
    return true;
  }
}
