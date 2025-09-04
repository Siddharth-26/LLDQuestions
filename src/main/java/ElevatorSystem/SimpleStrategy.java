package ElevatorSystem;

import java.util.Comparator;

public class SimpleStrategy implements Strategy{

    @Override
    public void addRequest(int floor, int currentFloor, Elevator elevator) {
      if(currentFloor>floor){
        elevator.goingDownQueue.add(floor);
        elevator.goingDownQueue.sort(new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o2-o1;
          }
        });
      }
      else if (currentFloor<floor) {
        elevator.goingUpQueue.add(floor);
        elevator.goingUpQueue.sort(new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
          return o1-o2;
        }
      });
    }
    }

  @Override
  public Integer move(Elevator elevator, String state) {
    if(state=="MOVINGUP"){
      if(elevator.goingUpQueue.isEmpty()){
        return null;
      }
      else{
        Integer floor = elevator.goingUpQueue.pollFirst();
        return floor;
      }
    }
    else{
      if(elevator.goingDownQueue.isEmpty()){
        return null;
      }
      else{
        Integer floor = elevator.goingDownQueue.pollFirst();
        return floor;
      }
    }
  }

}
