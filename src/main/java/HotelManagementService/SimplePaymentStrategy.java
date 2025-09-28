package HotelManagementService;

public class SimplePaymentStrategy implements PaymentStrategy{
  @Override
  public boolean makePayment(int amount) {
    System.out.println("Simple Payment Strategy");
    // Simulating that this is a third party process and that there might time in returning the response.
    try{
    Thread.sleep(1000);
  }
    catch (Exception e){
      System.out.println(e);
    }
    return true;
  }
}
