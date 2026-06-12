package LLDQuestion.CarRentalSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DateFilter implements Filter {
  private Filter childFilter;
  private VehicleReservationRepo vehicleReservationRepo;
  public DateFilter(Filter childFilter , VehicleReservationRepo vehicleReservationRepo) {
    this.childFilter = childFilter;
    this.vehicleReservationRepo = vehicleReservationRepo;
  }
  @Override
  public List<Vehicle> filter(List<Vehicle> vehicles, VehicleQuery query) {
    Date startDate = query.getStartDate();
    Date endDate = query.getEndDate();
    List<Vehicle> filteredVehicles = new ArrayList<>();
    for (Vehicle vehicle : vehicles) {
      boolean flag = true;
      Date currDate = startDate;
      while(currDate.before(endDate)) {
        VehicleDate vehicleDate = new VehicleDate(vehicle.getVehicleId(), currDate);
        if(this.vehicleReservationRepo.getReservationStatus(vehicleDate)==ReservationStatus.AVAILABLE){
          continue;
        }
        else{
          flag = false;
          break;
        }
      }
      if(flag){
        filteredVehicles.add(vehicle);
      }
    }
    if(this.childFilter!=null){
      return this.childFilter.filter(filteredVehicles, query);
    }
    return filteredVehicles;
  }
}
