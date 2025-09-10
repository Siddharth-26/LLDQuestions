package TrafficSignal;

import java.util.List;

public class NorthSouthState implements State{
  private List<Roads> roadsList;
  private State nextState;
  private int TIME_LIMIT= 60000;
  private TrafficSignalController trafficSignalController;
  public NorthSouthState(List<Roads> roads, State nextState, TrafficSignalController controller){
    this.roadsList = roads;
    this.nextState = nextState;
    this.trafficSignalController = controller;

  }
  @Override
  public void turnGreen() {
    for (Roads road: this.roadsList){
      road.setSignal(Signal.GREEN);
    }
    try {
      Thread.sleep(60000);
      this.turnRed();
      this.trafficSignalController.setState(this.nextState);
      this.trafficSignalController.switchOn();
    }
    catch (Exception e){
      System.out.println(e);
      this.turnRed();
      this.trafficSignalController.setState(this.nextState);
      this.trafficSignalController.switchOn();
    }
  }
  @Override
  public void turnRed() {
    for (Roads road : this.roadsList){
      road.setSignal(Signal.RED);
    }
  }

  @Override
  public boolean turnGreenByName(String roadName) {
    for (Roads road:roadsList){
      if(road.getName()==roadName){
        road.setSignal(Signal.GREEN);
        return true;
      }
    }
    return false;
  }

  public void setTIME_LIMIT(int TIME_LIMIT) {
    this.TIME_LIMIT = TIME_LIMIT;
  }
}
