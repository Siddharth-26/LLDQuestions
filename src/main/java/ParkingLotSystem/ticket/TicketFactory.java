package ParkingLotSystem.ticket;

public interface TicketFactory {
  public Ticket createTicket(int vehicleId, int parkingLotId);
}
