package ElevatorSystem;

public class IdleState implements State{

  Elevator elevator;
  Strategy strategy;

  public IdleState(Elevator elevator, Strategy strategy){
    this.elevator = elevator;
    this.strategy = strategy;
  }

  @Override
  public int move() {
    System.out.println("Elevator is in Idle State.");
    return this.elevator.currentFloor;
  }

  @Override
  public void addRequest(int floor, int currentFloor) {
    this.strategy.addRequest(floor, currentFloor, this.elevator);
    if(this.elevator.currentFloor>floor){
      State newState = new MovingDownState(elevator, strategy);
      this.elevator.setState(newState);
    }
    else if(this.elevator.currentFloor<floor){
      State newState = new MovingUpState(elevator, strategy);
      this.elevator.setState(newState);
    }
  }
}
