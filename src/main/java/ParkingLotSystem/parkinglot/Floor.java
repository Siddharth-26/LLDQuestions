package ParkingLotSystem.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
  int floorId;
  List<ParkingLot> parkingLot = new ArrayList<>();
  public void addParkingLot(ParkingLot parkingLot){
    this.parkingLot.add(parkingLot);
  }
  public void removeParkingLot(ParkingLot parkingLot){
    this.parkingLot.remove(parkingLot);
  }
  public List<ParkingLot> getFreeParkingLot(){
    List<ParkingLot> freeParkingLot = new ArrayList<>();
    for (ParkingLot x:this.parkingLot){
      if(!x.isOccupied){
        freeParkingLot.add(x);
      }
    }
    return freeParkingLot;
  }
  public boolean unparkVehicle(int parkingLotId, int vehicleId){
    for (ParkingLot x:this.parkingLot){
      if(x.parkingLotId==parkingLotId && x.vehicleId==vehicleId){
        x.setOccupied(false);
        x.setVehicleId(Integer.MAX_VALUE);
        return true;
      }
    }
    return false;
  }
}
