package LLDQuestion.CarRentalSystem;

import java.util.List;

public class SearchService {
  Filter filter;
  PickupLocationRepo pickupLocationRepo;
  public SearchService(Filter filter, PickupLocationRepo pickupLocationRepo) {
    this.filter = filter;
    this.pickupLocationRepo = pickupLocationRepo;
  }
  public List<Vehicle> getFilteredVehicles(VehicleQuery vehicleQuery) {
    return this.filter.filter(this.pickupLocationRepo.getPickupLocationVehicle(
        vehicleQuery.getPickupLocationId()), vehicleQuery);
  }
}
