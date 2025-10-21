package ParkingLot2;

import java.util.List;
// This is a strategy class specially because how the parking lot is being assigned and removed there may be some other implementations where we are doing other things like generating bill
// Or giving some priority to the assignment of the parking lot..
public class SimpleParkingManagerImpl implements ParkingManager{
  private ParkingRepo parkingRepo;
  private TicketFactory ticketFactory;
  public SimpleParkingManagerImpl(ParkingRepo parkingRepo, TicketFactory ticketFactory){
    this.parkingRepo = parkingRepo;
    this.ticketFactory = ticketFactory;
  }
  @Override
  public Ticket parkVehicle(Vehicle vehicle) {
    List<ParkingLot> freeLots = this.parkingRepo.getTypeParkingLot(vehicle.getVehicleType());
    for(ParkingLot x: freeLots){
      if(x.bookParkingLot(vehicle)){
        return this.ticketFactory.createTicket(vehicle, x);
      }
    }
    return null;
  }

  @Override
  public void unParkVehicle(Ticket ticket) {
    String parkingLotId = ticket.getParkingLotID();
    ParkingLot parkingLot = this.parkingRepo.getParkingLot(parkingLotId);
    parkingLot.emptyParkingLot();

  }
}
