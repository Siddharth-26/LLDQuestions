package ParkingLotSystem.parkinglot;

public class SmallParkingLot extends ParkingLot{
  public SmallParkingLot(int parkingLotId) {
    super(parkingLotId, ParkingLotType.SMALL);
  }
  public void occupyLot(){
    super.setOccupied(true);
  }
  public void emptyLot(){
    super.setOccupied(false);
  }
}
