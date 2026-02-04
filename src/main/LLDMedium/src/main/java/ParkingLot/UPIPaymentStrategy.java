package ParkingLot;

public class UPIPaymentStrategy implements  PaymentStrategy{
  private boolean isPaymentMade = false;
  @Override
  public void makePayment(int amount, ReservationTicket ticket) {
    System.out.println("Made payment of"+amount+" Rs.");
    isPaymentMade = true;
    if(isPaymentMade){
      ticket.setPaymentMade(true);
    }
  }
}
