package ParkingLot;

public class Orchestrator {
  private ParkingStrategy parkingStrategy;
  private PaymentStrategy paymentStrategy;
  private CalculateAmountStrategy calculateAmountStrategy;
  public Orchestrator(ParkingStrategy parkingStrategy, PaymentStrategy paymentStrategy, CalculateAmountStrategy calculateAmountStrategy){
    this.parkingStrategy = parkingStrategy;
    this.paymentStrategy = paymentStrategy;
    this.calculateAmountStrategy = calculateAmountStrategy;
  }

  public ReservationTicket assignParkingLot(Vehicle vehicle){
    return this.parkingStrategy.assignParkingLot(vehicle);
  }
  public boolean exitParkingLot(ReservationTicket ticket, PaymentStrategy paymentStrategy){
    int amount = calculateAmountStrategy.calculateAmount(ticket);
    // This makePayment should return true/false about itself because once we are making the payment
    // We need to know that it was successfull or not.. Otherwise right now we are assuming that the payment is always completed
    // and then moving on
    // In a more appropriate way it should have been like returning true.
    this.paymentStrategy.makePayment(amount, ticket);
    ParkingLot parkingLot = ticket.getParkingLot();
    parkingLot.setStatus(Status.EMPTY);
    if(ticket.isPaymentMade()){
      return true;
    }
    return false;
  }
}
