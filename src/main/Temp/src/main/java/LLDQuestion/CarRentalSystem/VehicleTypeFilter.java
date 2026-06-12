package LLDQuestion.CarRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleTypeFilter implements Filter{
  private Filter childFilter;

  public VehicleTypeFilter(Filter childFilter) {
    this.childFilter = childFilter;
  }
  public VehicleTypeFilter() {};
  @Override
  public List<Vehicle> filter(List<Vehicle> vehicles, VehicleQuery query) {
    List<Vehicle> filteredVehicles = new ArrayList<>();
    for (Vehicle vehicle : vehicles) {
      if(vehicle.getVehicleType().equals(query.getVehicleType())){
        filteredVehicles.add(vehicle);
      }
    }
    if(this.childFilter!=null){
      return this.childFilter.filter(filteredVehicles, query);
    }
    return filteredVehicles;
  }
}
