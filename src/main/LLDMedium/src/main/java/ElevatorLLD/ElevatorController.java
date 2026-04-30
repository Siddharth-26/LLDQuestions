package ElevatorLLD;

public interface ElevatorController {
  public void addFloor(int floor, int currentFloor);
  public int getNextFloor();
  public boolean hasNextFloor();
}
