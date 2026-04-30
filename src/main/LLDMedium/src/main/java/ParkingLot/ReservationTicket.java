package ParkingLot;

import java.time.Instant;

public class ReservationTicket {
  private ParkingLot parkingLot;
  private Vehicle vehicle;
  private Instant entryTime;
  private boolean isPaymentMade = false;
  public ReservationTicket(ParkingLot parkingLot, Vehicle vehicle, Instant entryTime){
    this.parkingLot = parkingLot;
    this.vehicle = vehicle;
    this.entryTime = entryTime;
  }

  public boolean isPaymentMade() {
    return isPaymentMade;
  }

  public void setPaymentMade(boolean paymentMade) {
    isPaymentMade = paymentMade;
  }

  public ParkingLot getParkingLot() {
    return parkingLot;
  }

  public void setParkingLot(ParkingLot parkingLot) {
    this.parkingLot = parkingLot;
  }

  public Instant getEntryTime() {
    return entryTime;
  }

  public void setEntryTime(Instant entryTime) {
    this.entryTime = entryTime;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
}
