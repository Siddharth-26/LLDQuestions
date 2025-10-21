package ParkingLot2;

import java.util.List;

public interface ParkingRepo {
  public List<ParkingLot> getTypeParkingLot(VehicleType type);
  public void freeParkingLot(String parkingLotId);
  public ParkingLot getParkingLot(String parkingLotId);
}
