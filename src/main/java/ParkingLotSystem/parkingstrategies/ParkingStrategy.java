package ParkingLotSystem.parkingstrategies;

import ParkingLotSystem.Vehicles.Vehicle;
import ParkingLotSystem.parkinglot.ParkingLot;
import ParkingLotSystem.ticket.Ticket;

public interface ParkingStrategy {
  public ParkingLot parkVehicle(Vehicle vehicle);
  public boolean unparkVehicle(Ticket ticket);
}
