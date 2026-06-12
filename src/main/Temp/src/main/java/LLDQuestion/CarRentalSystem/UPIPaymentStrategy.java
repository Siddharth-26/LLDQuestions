package LLDQuestion.CarRentalSystem;

public class UPIPaymentStrategy implements PaymentStrategy {
  @Override
  public boolean pay(int amount) {
    System.out.println("Paying via UPI");
    try {
      Thread.sleep(5);
      return true;
    }
    catch (InterruptedException e) {
      System.out.println("Payment Failed");
      return false;
    }
  }
}
