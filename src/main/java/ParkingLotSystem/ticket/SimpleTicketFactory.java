package ParkingLotSystem.ticket;

public class SimpleTicketFactory implements  TicketFactory{

  @Override
  public Ticket createTicket(int vehicleId, int parkingLotId) {
    return new SimpleTicket(parkingLotId, vehicleId);
  }
}
