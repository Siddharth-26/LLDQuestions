package ParkingLot2;

public class TicketFactoryImpl implements TicketFactory{
  @Override
  public Ticket createTicket(Vehicle vehicle, ParkingLot parkingLot) {
    return new TicketImpl(vehicle, parkingLot);
  }
}
