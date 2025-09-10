package TrafficSignal;

public interface State {
  public void turnGreen();
  public void turnRed();
  public boolean turnGreenByName(String roadName);
}
