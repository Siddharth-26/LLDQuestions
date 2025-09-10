package TrafficSignal;

public class Roads {
  public String direction;
  public String name;
  public Signal signal;

  public Roads(String direction, String name, Signal signal) {
    this.direction = direction;
    this.name = name;
    this.signal = signal;
  }

  public void setSignal(Signal signal) {
    this.signal = signal;
  }

  public String getName() {
    return name;
  }
}
