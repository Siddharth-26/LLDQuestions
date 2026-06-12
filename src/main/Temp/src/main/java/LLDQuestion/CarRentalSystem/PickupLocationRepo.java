package LLDQuestion.CarRentalSystem;

import java.util.HashMap;
import java.util.List;

public class PickupLocationRepo {
  private HashMap<String, List<Vehicle>> pickupLocations;
  public PickupLocationRepo(HashMap<String,List<Vehicle>> pickupLocations) {
    this.pickupLocations = pickupLocations;
  }
  public List<Vehicle> getPickupLocationVehicle(String pickupLocationId) {
    return pickupLocations.get(pickupLocationId);
  }
}
