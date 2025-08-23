package ParkingLotSystem.parkingstrategies;

import java.util.List;

import ParkingLotSystem.Vehicles.Vehicle;
import ParkingLotSystem.Vehicles.VehicleType;
import ParkingLotSystem.parkinglot.ParkingComplex;
import ParkingLotSystem.parkinglot.ParkingLot;
import ParkingLotSystem.parkinglot.ParkingLotType;
import ParkingLotSystem.ticket.Ticket;

public class SimpleParkingStrategy implements  ParkingStrategy{
  ParkingComplex parkingComplex;
  public SimpleParkingStrategy(ParkingComplex parkingComplex){
    this.parkingComplex = parkingComplex;
  }

  @Override
  public ParkingLot parkVehicle(Vehicle vehicle) {
    List<ParkingLot> freeParkingLots = this.parkingComplex.getFreeParkingLot();
    if(vehicle.getVehicleType()== VehicleType.MOTORCYCLE){
      return this.parkInSmallLot(vehicle, freeParkingLots);
    }
    else if(vehicle.getVehicleType()== VehicleType.CAR){
      return this.parkInCompactLot(vehicle, freeParkingLots);
    }
    else{
      return this.parkInLargeLot(vehicle, freeParkingLots);
    }
  }

  private ParkingLot parkInSmallLot(Vehicle vehicle, List<ParkingLot> freeParkingLots){
    for (ParkingLot x:freeParkingLots){
      if(x.getParkingLotType()== ParkingLotType.SMALL){
        return x;
      }
    }
    return this.parkInCompactLot(vehicle, freeParkingLots);
  }
  private ParkingLot parkInCompactLot(Vehicle vehicle, List<ParkingLot> freeParkingLots){
    for (ParkingLot x:freeParkingLots){
      if(x.getParkingLotType()== ParkingLotType.COMPACT){
        return x;
      }
    }
    return this.parkInLargeLot(vehicle, freeParkingLots);
  }
  private ParkingLot parkInLargeLot(Vehicle vehicle, List<ParkingLot> freeParkingLots){
    for (ParkingLot x:freeParkingLots){
      if(x.getParkingLotType()== ParkingLotType.LARGE){
        return x;
      }
    }
    return null;
  }

  @Override
  public boolean unparkVehicle(Ticket ticket) {
    return this.parkingComplex.unparkVehicle(ticket.getParkingLotId(), ticket.getVehicleId());
  }
}
