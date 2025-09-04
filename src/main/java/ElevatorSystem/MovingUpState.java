package ElevatorSystem;

public class MovingUpState implements State{

  Elevator elevator;
  Strategy strategy;

  public MovingUpState(Elevator elevator, Strategy strategy){
    this.elevator = elevator;
    this.strategy = strategy;
  }

  @Override
  public int move() {
    Integer value =  this.strategy.move(elevator, "MOVINGUP");
    if(value==null){
      if(!this.elevator.goingDownQueue.isEmpty()){
      State newState = new MovingDownState(elevator, strategy);
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
