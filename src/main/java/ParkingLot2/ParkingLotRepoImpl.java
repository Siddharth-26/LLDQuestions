package ParkingLot2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ParkingLotRepoImpl implements ParkingRepo{
  private ConcurrentHashMap<String, ParkingLot> parkingLotMap;

  public ParkingLotRepoImpl(ConcurrentHashMap<String,ParkingLot> parkingLotMap) {
    this.parkingLotMap = parkingLotMap;
  }

  @Override
  public List<ParkingLot> getTypeParkingLot(VehicleType type) {
    List<ParkingLot> arr = new ArrayList<>();
    for (ParkingLot x : this.parkingLotMap.values()){
      if(x.getParkingLotType().equals(type) && x.isOccupied()==false){
        arr.add(x);
      }
    }
    return arr;
  }

  @Override
  public void freeParkingLot(String parkingLotId) {
    ParkingLot parkingLot = this.parkingLotMap.get(parkingLotId);
    parkingLot.emptyParkingLot();
  }

  @Override
  public ParkingLot getParkingLot(String parkingLotId) {
    return this.parkingLotMap.get(parkingLotId);
  }
}
