package ParkingLotSystem.parkinglot;

public class LargeParkingLot extends ParkingLot{
  public LargeParkingLot(int parkingLotId, ParkingLotType parkingLotType) {
    super(parkingLotId, parkingLotType);
  }
  public void occupyLot(){
    super.setOccupied(true);
  }
  public void emptyLot(){
    super.setOccupied(false);
  }
}
