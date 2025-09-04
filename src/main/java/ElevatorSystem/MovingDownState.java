package ElevatorSystem;

public class MovingDownState implements State{
  Elevator elevator;
  Strategy strategy;

  public MovingDownState(Elevator elevator, Strategy strategy){
    this.elevator = elevator;
    this.strategy = strategy;
  }

  @Override
  public int move() {
    Integer value =  this.strategy.move(elevator, "MOVINGDOWN");
    if(value==null){
      if(!this.elevator.goingUpQueue.isEmpty()){
        State newState = new MovingUpState(elevator, strategy);
        this.elevator.setState(newState);
        return this.elevator.currentFloor;
      }
      else{
        State newState = new IdleState(elevator, strategy);
        this.elevator.setState(newState);
        return this.elevator.currentFloor;
      }
    }
    else {
      return value;
    }
  }

  @Override
  public void addRequest(int floor, int currentFloor) {
    this.strategy.addRequest(floor, currentFloor, elevator);
  }
}
