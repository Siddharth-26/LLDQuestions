package AirlineManagementSystem;

public class SimpleBookingSystem implements BookingSystem{
  @Override
  public boolean bookFlight(int seats, Flight flight, PaymentStrategies paymentStrategies) {
    try{
      int amount  = flight.blockSeats(seats);
      if(paymentStrategies.makePayment(amount)){
        return true;
      }
      else{
        flight.unblockSeats(seats);
        return false;
      }
    } catch (Exception e) {
      return false;
    }
  }
}
