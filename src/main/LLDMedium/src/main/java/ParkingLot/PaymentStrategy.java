package ParkingLot;

public interface PaymentStrategy {
  public void makePayment(int amount, ReservationTicket ticket);
}
