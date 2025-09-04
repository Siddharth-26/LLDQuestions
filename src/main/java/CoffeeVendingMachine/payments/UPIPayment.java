package CoffeeVendingMachine.payments;

public class UPIPayment implements Payment{
  @Override
  public boolean pay() {
    System.out.println("Paid Via UPI application...");
    return true;
  }
}
