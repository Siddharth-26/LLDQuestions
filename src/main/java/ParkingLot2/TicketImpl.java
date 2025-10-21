package ParkingLot2;

public class TicketImpl implements Ticket{
  private Vehicle vehicle;
  private ParkingLot parkingLot;

  public TicketImpl(Vehicle vehicle, ParkingLot parkingLot) {
    this.vehicle = vehicle;
    this.parkingLot = parkingLot;
  }

  @Override
  public String getParkingLotID() {
    return this.parkingLot.getParkingLotId();
  }

  @Override
  public String getVehicleId() {
    return this.vehicle.getVehicleId();
  }
}
