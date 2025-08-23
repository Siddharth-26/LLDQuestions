package ParkingLotSystem;

import ParkingLotSystem.ticket.Ticket;

public interface PricingStrategy {
  public double calculatePrice(Ticket ticket);
}
