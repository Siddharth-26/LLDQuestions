package LLDQuestion.ParkingLot;

public class ParkingLotManager {
  ParkingLotAssignmentStrategy parkingLotAssignmentStrategyImpl;
  public Ticket reserveParkingLot(Vehicle vehicle){
    this.parkingLotAssignmentStrategyImpl.reserveParkingLot(vehicle.getType());

  }
}
