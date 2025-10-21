package ParkingLot2;

public interface TicketFactory {
  public Ticket createTicket(Vehicle vehicle, ParkingLot parkingLot);
}
