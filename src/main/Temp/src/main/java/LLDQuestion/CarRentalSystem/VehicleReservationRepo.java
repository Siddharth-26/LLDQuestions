package LLDQuestion.CarRentalSystem;

import java.util.HashMap;

public class VehicleReservationRepo {
  HashMap<VehicleDate, ReservationStatus> vehicleDateReservationStatusHashMap;
  public VehicleReservationRepo() {
    vehicleDateReservationStatusHashMap = new HashMap<>();
  }
  public ReservationStatus getReservationStatus(VehicleDate vehicleDateObj) {
    return vehicleDateReservationStatusHashMap.get(vehicleDateObj);
  }
  public synchronized boolean  reserveVehicleForDate(VehicleDate vehicleDateObj) {
    if(vehicleDateReservationStatusHashMap.containsKey(vehicleDateObj) && vehicleDateReservationStatusHashMap.get(vehicleDateObj) == ReservationStatus.AVAILABLE) {
      this.vehicleDateReservationStatusHashMap.put(vehicleDateObj, ReservationStatus.RESERVED);
    return true;
    }
    return false;
  }
  public synchronized boolean unreserve(VehicleDate vehicleDateObj) {
    this.vehicleDateReservationStatusHashMap.put(vehicleDateObj,  ReservationStatus.AVAILABLE);
    return true;
  }
}
