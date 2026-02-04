package ParkingLot;

public class CashPaymentStrategy implements PaymentStrategy{
  private boolean isPaymentMade;
  @Override
  public void makePayment(int amount, ReservationTicket ticket) {
    System.out.println("Payment Received of "+amount+" Rs.");
    isPaymentMade = true;
    if(isPaymentMade){
      ticket.setPaymentMade(true);
    }
    return;
  }
}
