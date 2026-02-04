package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
  private List<ParkingLot> parkingLotList;
  private int floorNumber;
  public Floor(List<ParkingLot> parkingLotList, int floorNumber){
    this.floorNumber = floorNumber;
    this.parkingLotList = parkingLotList;
  }

  public List<ParkingLot> getParkingLotList() {
    return parkingLotList;
  }

  public void setParkingLotList(List<ParkingLot> parkingLotList) {
    this.parkingLotList = parkingLotList;
  }

  public int getFloorNumber() {
    return floorNumber;
  }

  public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
  }
  public List<ParkingLot> getVehicleTypeParkingLot(VehicleType vehicleType){
    List<ParkingLot> ansList = new ArrayList<>();
    for(ParkingLot x: this.parkingLotList){
      if(x.getVehicleType()==vehicleType){
        ansList.add(x);
      }
    }
    return ansList;
  }
}
