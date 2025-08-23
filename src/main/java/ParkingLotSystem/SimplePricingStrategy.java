package ParkingLotSystem;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import ParkingLotSystem.ticket.Ticket;

public class SimplePricingStrategy implements PricingStrategy {
  private double hourlyRate;
  public SimplePricingStrategy(double hourlyRate){
    this.hourlyRate = hourlyRate;
  }
  @Override
  public double calculatePrice(Ticket ticket) {
    LocalDateTime parkingTime = ticket.getParkingTime();
    LocalDateTime currentTime = LocalDateTime.now();
    long parkingHours = parkingTime.until(currentTime, ChronoUnit.HOURS);
    return parkingHours*this.hourlyRate;
  }
}
