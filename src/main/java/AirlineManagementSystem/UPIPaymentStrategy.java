package AirlineManagementSystem;

public class UPIPaymentStrategy implements PaymentStrategies{
  @Override
  public boolean makePayment(int amount) {
    System.out.println("Paying via UPI Payment");
    return true;
  }
}
