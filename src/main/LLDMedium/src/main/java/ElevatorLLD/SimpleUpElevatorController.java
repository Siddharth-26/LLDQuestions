package ElevatorLLD;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SimpleUpElevatorController implements ElevatorController{
  private Elevator elevator;
  private List<Integer> floors = new ArrayList<>();
  public SimpleUpElevatorController(Elevator elevator){
    this.elevator = elevator;
  }
  @Override
  public void addFloor(int floor, int currentFloor) {
    this.floors.add(floor);
    this.floors.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        int value = o1-o2;
        if(value>0){
          return 1;
        }
        else if(value<0){
          return -1;
        }
        else{
          return 0;
        }
      }
    });
    this.elevator.setNextFloor(this.floors.get(0));
  }

  @Override
  public int getNextFloor() {
    return 0;
  }

  @Override
  public boolean hasNextFloor() {
    return false;
  }
}
