package AirlineManagementSystem;

public interface BookingSystem {
  public boolean bookFlight(int seats, Flight flight, PaymentStrategies paymentStrategies);
}
