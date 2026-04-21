package CarRentalSystem;

import java.util.ArrayList;

public class Car {
  private String carId;
  private String carName;
  private String carNumber;
  private List<Slot> bookedSlots = new ArrayList<>();
}
