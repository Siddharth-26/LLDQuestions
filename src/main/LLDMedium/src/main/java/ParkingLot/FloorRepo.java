package ParkingLot;

import java.util.HashMap;
import java.util.List;

public class FloorRepo {
  private HashMap<Integer, Floor> floorHashMap;
  public FloorRepo(HashMap<Integer, Floor> floorHashMap){
    this.floorHashMap = floorHashMap;
  }
  public List<ParkingLot> getFloor(VehicleType vehicleType){
    List<Integer> list = this.floorHashMap.keySet().stream().toList();
    for (Integer x:list){
      List<ParkingLot> parkingLots = this.floorHashMap.get(x).getVehicleTypeParkingLot(vehicleType);
      if(parkingLots.size()==0){
        continue;
      }
      else{
        return parkingLots;
      }
    }
    return null;
  }
}
