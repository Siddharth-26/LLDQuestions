package ElevatorSystem;

public interface State {
  public int move();
  public void addRequest(int floor, int currentFloor);
}
