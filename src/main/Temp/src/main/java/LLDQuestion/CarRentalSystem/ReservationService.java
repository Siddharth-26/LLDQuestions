package LLDQuestion.CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
  private VehicleReservationRepo vehicleReservationRepo;
  private ReservationRepo reservationRepo;
  private PaymentService paymentService;
  private PriceCalculatorStrategy priceCalculator;
  private VehilcleRepo vehilcleRepo;

  public ReservationService(
      VehicleReservationRepo vehicleReservationRepo,
      ReservationRepo reservationRepo,
      PaymentService paymentService,
      PriceCalculatorStrategy priceCalculator,
      VehilcleRepo vehilcleRepo) {
    this.vehicleReservationRepo = vehicleReservationRepo;
    this.reservationRepo = reservationRepo;
    this.paymentService = paymentService;
    this.priceCalculator = priceCalculator;
    this.vehilcleRepo = vehilcleRepo;
  }

  public Reservation bookVehicle(PaymentType paymentType, String vehicleId, String userId, Date startDate, Date endDate){
    try{
      PaymentStrategy paymentStrategy = this.paymentService.getPaymentStrategy(paymentType);
      try{
        if(paymentStrategy.pay(priceCalculator.calculateAmount(this.vehilcleRepo.getVehicle(vehicleId), startDate, endDate))){
          Date currentDate = startDate;
          List<VehicleDate> reservedDates = new ArrayList<>();
          while(!currentDate.after(endDate)){
            if(this.vehicleReservationRepo.reserveVehicleForDate(new VehicleDate(vehicleId, currentDate))){
              reservedDates.add(new  VehicleDate(vehicleId, currentDate));
            }
            else{
              for(VehicleDate vehicleDate : reservedDates){
                this.vehicleReservationRepo.unreserve(vehicleDate);
              }
              return null;
            }
            // go to the next Day some operation for the next day needs to be done I am not familiar with the Date util in java to do this calculation.
            currentDate = currentDate;
          }
          Reservation reservation = new Reservation(vehicleId, userId, startDate, endDate);
          this.reservationRepo.addReservation(reservation);
          return reservation;
        }

      }
      catch(Exception e){
        System.out.println("Cannot make Payment");
      }
    }
    catch (Exception e){
      System.out.printf("Incorrect Payment Type");
    }
    return null;
  }
}
