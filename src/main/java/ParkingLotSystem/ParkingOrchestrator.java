package ParkingLotSystem;

import ParkingLotSystem.Vehicles.Vehicle;
import ParkingLotSystem.parkinglot.ParkingLot;
import ParkingLotSystem.parkingstrategies.ParkingStrategy;
import ParkingLotSystem.ticket.Ticket;
import ParkingLotSystem.ticket.TicketFactory;

public class ParkingOrchestrator {

  PricingStrategy pricingStrategy;
  ParkingStrategy parkingStrategy;
  TicketFactory ticketFactory;

  public ParkingOrchestrator(ParkingStrategy parkingStrategy, PricingStrategy pricingStrategy, TicketFactory ticketFactory){
    this.parkingStrategy = parkingStrategy;
    this.pricingStrategy = pricingStrategy;
    this.ticketFactory = ticketFactory;
  }

  public Ticket parkVehicle(Vehicle vehicle){
    ParkingLot parkingLot = this.parkingStrategy.parkVehicle(vehicle);
    if(parkingLot==null){
      System.out.println("No available parking lot.");
      return null;
    }
    else{
      return this.ticketFactory.createTicket(vehicle.getVehicleId(), parkingLot.getParkingLotId());
    }
  }
  public double unparkVehicle(Ticket ticket){
    // There should be a checker here that vehicle is succesfully unparked and then we should calculate the price.
    boolean success = this.parkingStrategy.unparkVehicle(ticket);
    if(success){
      return this.pricingStrategy.calculatePrice(ticket);
    }
    else{
      return 0;
    }
  }

}
