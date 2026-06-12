package LLDQuestion.CarRentalSystem;

import java.util.HashMap;

public class VehilcleRepo {
  private HashMap<String, Vehicle> vehicleHashMap;
  public VehilcleRepo(HashMap<String, Vehicle> vehicleHashMap) {
    this.vehicleHashMap = vehicleHashMap;
  }
  public Vehicle getVehicle(String vehicleId){
    if(this.vehicleHashMap.containsKey(vehicleId)){
      return this.vehicleHashMap.get(vehicleId);
    }
    return null;
  }
  // Put vehicle is also needed but I am not making this class in the current system
}
