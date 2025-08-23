package ParkingLotSystem.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingComplex {
  String complexName;
  List<Floor> floors = new ArrayList<>();
  public ParkingComplex(String name){
    this.complexName = name;
  }
  public List<ParkingLot> getFreeParkingLot(){
    List<ParkingLot> freeParkingLot = new ArrayList<>();
    for (Floor x: floors){
      freeParkingLot.addAll(x.getFreeParkingLot());
    }
    return freeParkingLot;
  }
  // Here there could be a scenario where users are trying to unpark an already unparked vehicle.
  public boolean unparkVehicle(int parkingLotId, int vehicleId){
    for (Floor x:floors) {
      if(x.unparkVehicle(parkingLotId, vehicleId)){
        return true;
      }
    }
    return false;
  }
}

