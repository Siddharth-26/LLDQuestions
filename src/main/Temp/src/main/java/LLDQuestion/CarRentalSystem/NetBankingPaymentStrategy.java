package LLDQuestion.CarRentalSystem;

public class NetBankingPaymentStrategy implements PaymentStrategy {
  @Override
  public boolean pay(int amount) {
    try{
      System.out.println("Paying via Net Banking");
      Thread.sleep(5000);
      return true;
    }
    catch(InterruptedException e){
      System.out.println("Payment Failed");
      return false;
    }
  }
}
