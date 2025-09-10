package TrafficSignal;

import java.util.List;
import java.util.Objects;

public class EastWestState implements State{
  private List<Roads> roadsList;
  private int TIME_LIMIT = 60000;
  private State nextState;
  private TrafficSignalController controller;
  public EastWestState(List<Roads> roadsList, State nextState, TrafficSignalController controller){
    this.nextState = nextState;
    this.roadsList = roadsList;
    this.controller = controller;
  }
  @Override
  public void turnGreen()  {
    for (Roads road: this.roadsList){
      road.setSignal(Signal.GREEN);
    }
    try{
      Thread.sleep(this.TIME_LIMIT);
      this.turnRed();
      this.controller.setState(this.nextState);
      this.controller.switchOn();
    } catch (Exception e) {
      System.out.println(e);
      this.turnRed();
      this.controller.setState(this.nextState);
      this.controller.switchOn();
    }
  }

  @Override
  public void turnRed() {
  for (Roads road: this.roadsList){
    road.setSignal(Signal.RED);
  }
  }

  @Override
  public boolean turnGreenByName(String roadName) {
    for (Roads road: roadsList){
      if(Objects.equals(road.getName(), roadName)){
        road.setSignal(Signal.GREEN);
        return true;
      }
    }
    return false;
  }
}
