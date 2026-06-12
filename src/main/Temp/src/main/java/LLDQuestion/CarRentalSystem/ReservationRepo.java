package LLDQuestion.CarRentalSystem;

import java.util.HashMap;

public class ReservationRepo {
  private HashMap<String, Reservation> reservationHashMap = new HashMap<>();
  public boolean addReservation(Reservation reservation) {
    this.reservationHashMap.put(reservation.getReservationId(), reservation);
    return true;
  }
  public Reservation getReservation(String reservationId) {
    return this.reservationHashMap.get(reservationId);
  }

}
