package ParkingLotSystem.parkinglot;

public class CompactParkingLot extends ParkingLot{
  public CompactParkingLot(int parkingLotId, ParkingLotType parkingLotType) {
    super(parkingLotId, parkingLotType);
  }
  public void occupyLot(){
    super.setOccupied(true);
  }
  public void emptyLot(){
    super.setOccupied(false);
  }
}
