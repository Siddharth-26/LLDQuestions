package LLDQuestion.CarRentalSystem;

import java.util.Date;
import java.util.UUID;

public class Reservation {
  private String vehicleId;
  private String userId;
  private Date startDate;
  private Date endDate;
  private String reservationId;
  private boolean isCancelled;
  public Reservation(String vehicleId, String userId, Date startDate, Date endDate) {
    this.vehicleId = vehicleId;
    this.userId = userId;
    this.startDate = startDate;
    this.endDate = endDate;
    this.isCancelled = false;
    this.reservationId = UUID.randomUUID().toString();
  }
  public String getVehicleId() {
    return vehicleId;
  }
  public void cancelReservation() {
    this.isCancelled = true;
  }
  public String getUserId() {
    return userId;
  }
  public Date getStartDate() {
    return startDate;
  }
  public Date getEndDate() {
    return endDate;
  }
  public boolean changeStartDate(Date startDate) {
    this.startDate = startDate;
    return true;
  }
  public boolean changeEndDate(Date endDate) {
    this.endDate = endDate;
    return true;
    }

  public String getReservationId() {
    return reservationId;
  }

  public void setReservationId(String reservationId) {
    this.reservationId = reservationId;
  }
}
