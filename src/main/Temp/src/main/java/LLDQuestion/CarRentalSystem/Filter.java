package LLDQuestion.CarRentalSystem;

import java.util.List;

public interface Filter {
  public List<Vehicle> filter(List<Vehicle> vehicles, VehicleQuery query);
}
