package ElevatorSystem;

import java.util.LinkedList;

public class Elevator {
  LinkedList<Integer> goingUpQueue = new LinkedList<>();
  LinkedList<Integer> goingDownQueue = new LinkedList<>();
  State state;
  int currentFloor;
  public Elevator(State state){
    this.state = state;
    this.currentFloor = 0;
  }
  public void move(){
    while(goingDownQueue.size()>0 || goingDownQueue.size()>0){
      this.currentFloor = this.state.move();
      this.stop();
    }
  }
  public void addRequest(int floor){
    this.state.addRequest(floor, currentFloor);
    this.move();
  }
  public void stop() {
    this.openGate();
    this.closeGate();
  }

  private void closeGate() {
    System.out.println("Gates are closing please move away from the Gate");
  }
  public void setState(State state){
    this.state = state;
  }

  private void openGate() {
    System.out.println("Gates are now Open please exit");
  }

}
