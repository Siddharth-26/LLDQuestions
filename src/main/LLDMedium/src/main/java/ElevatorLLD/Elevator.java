package ElevatorLLD;

public class Elevator {
  private int id;
  private int currentFloor;
  private int nextFloor;
  private ElevatorState elevatorState;
  private ElevatorController elevatorController;
  public Elevator(int id){
    this.currentFloor = 0;
    this.nextFloor = 0;
    this.elevatorController = new SimpleUpElevatorController(this);
    this.id = id;
    this.elevatorState = ElevatorState.IDLE;
  }
  public void insertFloor(int floor) throws InterruptedException {
    System.out.println("Gates opened");

    this.elevatorController.addFloor(floor, this.currentFloor);
    // The next floor can change here so we need to make sure that the next floor we are going to is ok like going to 10th floor and then
    // we realise that the person entered 4th floor then we need to make sure that we go to the 4th floor first and then 10th floor next.
    // We can use something like minHeap if the lift is moving upwards and then maxHeap if the lift is moving down wards.. Based on the direction we can have 2 strategies..

//    this.nextFloor = this.getNextFloor();
    this.move();
  }

  private int getNextFloor(){
    return this.elevatorController.getNextFloor();
  }
  public void move() throws InterruptedException {
    while(this.elevatorController.hasNextFloor()){
      Thread.sleep(3000);
      this.currentFloor = nextFloor;
      this.nextFloor = this.elevatorController.getNextFloor();
    }
    this.elevatorState = ElevatorState.IDLE;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void setCurrentFloor(int currentFloor) {
    this.currentFloor = currentFloor;
  }

  public void setNextFloor(int nextFloor) {
    this.nextFloor = nextFloor;
  }

  public ElevatorState getElevatorState() {
    return elevatorState;
  }

  public void setElevatorState(ElevatorState elevatorState) {
    this.elevatorState = elevatorState;
  }

  public ElevatorController getElevatorController() {
    return elevatorController;
  }

  public void setElevatorController(ElevatorController elevatorController) {
    this.elevatorController = elevatorController;
  }
}
