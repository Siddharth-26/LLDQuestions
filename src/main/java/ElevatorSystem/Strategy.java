package ElevatorSystem;

public interface Strategy {
  public void addRequest(int floor, int currentFloor, Elevator elevator);
  public Integer move(Elevator elevator, String state);
}
